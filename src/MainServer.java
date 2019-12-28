import java.net.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class ConnectionThread extends Thread {

    Socket soc;
    DataInputStream din;
    DataOutputStream dout;
    private Connection connection;
    private PreparedStatement pst;
    private ResultSet resultSet;
    String catagory, type, Query, post, postname, name, pass,q;

    ConnectionThread(Socket s) throws IOException {
        this.connection = null;
        this.pst = null;
        this.resultSet = null;
        soc = s;
        din = new DataInputStream(soc.getInputStream());
        dout = new DataOutputStream(soc.getOutputStream());
        start(); // Start the thread
    }

    @Override
    public void run() {
        try {

            String str;
            do {
                str = GetInfo();
                ProcessCommand(str);

            } while (!str.equals("stop"));
        } catch (Exception e) {
        }
    }

    String GetInfo() throws IOException {

        String x = din.readUTF();
        dout.flush();
        System.out.println(x);
        return x;
    }

    void SendInfo(String str) throws IOException {
        dout.writeUTF(str);
        dout.flush();
    }

    void ProcessCommand(String com) throws IOException, SQLException {
        if ("Log In".equals(com)) {
            login();
        }

        if ("Sign Up".equals(com)) {
            Signup();
        }

        if ("GotoPost".equals(com)) {
            GotoPost();
        }
        
        if ("GotoTeacherPost".equals(com)) {
            GotoTeacherPost();
        }

        if ("Send".equals(com)) {
            Write(name, post, GetInfo());
        }

        if ("Stealth Send".equals(com)) {
            Write("???", post, GetInfo());
        }

        if ("Reload".equals(com)) {
            retrieve(post);
        }

        if ("Fetch".equals(com)) {
            Fetch();
        }

        if ("CreatePost".equals(com)) {
            CreatePost();
        }

        if ("DeletePost".equals(com)) {
            DeletePost();
        }

        if ("ChangePass".equals(com)) {
            ChangePass();
        }
        if ("Update".equals(com)) {
            UpdateACC();
        }

        if ("DeleteUser".equals(com)) {
            DeleteUser();
        }

        if ("ProfileName".equals(com)) {
            ProfileName();
        }

        if ("ProfileNPost".equals(com)) {
            ProfileNPost();
        }

        if ("FetchTeacher".equals(com)) {
            FetchTeacher();
        }
        
        if ("FetchPost".equals(com)) {
            FetchPost();
        }

    }

    void login() throws IOException, SQLException {

        catagory = GetInfo();
        type = GetInfo();
        while (true) {
            if ("enter".equals(GetInfo())) {
                connection = JavaDbConnect.dbConnect(catagory);
                String sql = "select * from " + type + " where Username = ? and Password = ?";

                pst = connection.prepareStatement(sql);
                name = GetInfo();
                String pass = GetInfo();
                pst.setString(1, name);
                pst.setString(2, pass);
                resultSet = pst.executeQuery();

                System.out.println(type);
                if (resultSet.next()) {
                    SendInfo("Allow");
                    SendInfo(type);
                    resultSet.close();
                    pst.close();
                    connection.close();
                    return;
                } else {
                    SendInfo("Deny");
                    SendInfo(type);
                }
                //SendInfo(" Wrong UserName And Password ");
            } else {
                return;
            }
        }
    }

    void Signup() throws IOException, SQLException {
        catagory = GetInfo();
        type = GetInfo();
        while (true) {
            if ("enter".equals(GetInfo())) {

                if ("Teacher".equals(type)) {
                    File file = new File("D:\\FeedBacks\\" + GetInfo());
                    if (!file.exists()) {
                        if (file.mkdir()) {
                            System.out.println("Directory is created!");
                        } else {
                            System.out.println("Failed to create directory!");
                        }
                    }
                }

                connection = JavaDbConnect.dbConnect(catagory);
                Query = "insert into " + type + "(Username,Fullname,Institute,Email,Gender,Password) values(?,?,?,?,?,?)";
                pst = connection.prepareStatement(Query);

                pst.setString(1, GetInfo());
                pst.setString(2, GetInfo());
                pst.setString(3, GetInfo());
                pst.setString(4, GetInfo());
                pst.setString(5, GetInfo());
                pst.setString(6, GetInfo());

                pst.execute();
                resultSet.close();
                pst.close();
                connection.close();

            } else {
                return;
            }
        }

    }

    void Fetch() throws IOException {
        String[] FilePile = new String[10];
        File path = new File("D:\\FeedBacks\\" + name);

        File[] files = path.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                String x = files[i].getName();
                SendInfo(x);
                System.out.println(files[i]);
            }
        }
        SendInfo("");
    }

    public void retrieve(String FileName) throws FileNotFoundException, IOException {
        File file = new File(FileName);
        BufferedReader bufRdr = new BufferedReader(new FileReader(file));

        String line = null;

        try {
            while ((line = bufRdr.readLine()) != null) {
                System.out.println(line);
                SendInfo(line);
            }
            SendInfo("");
        } catch (IOException e) {

        }
        bufRdr.close();
        System.out.println("Done");
    }

    public void Write(String n, String file, String msg) throws FileNotFoundException {
        try {
            FileWriter fw = new FileWriter(file, true); //the true will append the new data
            fw.write(n + " : " + msg + "\n");//appends the string to the file
            SendInfo(n + " : " + msg + "\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());

        }
    }

    void GotoPost() throws IOException, SQLException {
        SendInfo(name);
        post = GetInfo();
        postname = GetInfo();
        retrieve(post);
    }
    
    void GotoTeacherPost() throws IOException, SQLException {
        post = GetInfo();
        postname = GetInfo();
        retrieve(post);
    }

    void CreatePost() throws IOException {
        SendInfo(name);
        File file = new File(GetInfo() + ".txt");
        file.createNewFile();

    }

    void DeletePost() throws IOException {

        //Path fileToDeletePath = Paths.get(GetInfo() + ".txt");
        //Files.delete(fileToDeletePath);
        //System.out.println("Deleted!");
        File file = new File(GetInfo() + ".txt");
        System.out.println("Delete Operation");
        //FileDeleteStrategy.FORCE.delete(file);
        if (file.delete()) {
            System.out.println(file.getName() + " is deleted!");
        } else {
            System.out.println("Delete operation is failed.");
        }
    }

    void ChangePass() throws IOException, SQLException {

        pass = GetInfo();
        System.out.println("1");
        connection = JavaDbConnect.dbConnect(catagory);
        System.out.println("2");
        String sql = "select * from " + type + " where Username = ? and Password = ?";
        System.out.println("3");
        pst = connection.prepareStatement(sql);
        System.out.println("4");
        pst.setString(1, name);
        pst.setString(2, pass);
        resultSet = pst.executeQuery();
        if (resultSet.next()) {
            System.out.println("5");
            SendInfo("Allow");
            System.out.println("6");
            if (!"Proceed".equals(GetInfo())) {
                return;
            }
            pass = GetInfo();
            System.out.println("7");
            Query = "update " + type + " set Password=? where Username=?";
            pst = connection.prepareStatement(Query);
            pst.setString(1, pass);
            pst.setString(2, name);
            pst.execute();
            resultSet.close();
            pst.close();
        } else {
            SendInfo("Deny");
            resultSet.close();
            pst.close();
        }
        System.out.println("Done");
    }

    void UpdateACC() throws IOException, SQLException {
        connection = JavaDbConnect.dbConnect(catagory);
        String sql = "update " + type + " set Username=?, Fullname=?, Institute=?, Email=?, Gender=? where Username=?";;
        pst = connection.prepareStatement(sql);
        pst.setString(1, GetInfo());
        pst.setString(2, GetInfo());
        pst.setString(3, GetInfo());
        pst.setString(4, GetInfo());
        pst.setString(5, GetInfo());
        pst.setString(6, name);

        pst.execute();
        resultSet.close();
        pst.close();
        connection.close();
    }

    void DeleteUser() throws SQLException {
        connection = JavaDbConnect.dbConnect(catagory);
        System.out.println(catagory + " " + type + " " + name);
        String Query = "delete from " + type + " where Username=" + "?" + "";
        pst = connection.prepareStatement(Query);
        pst.setString(1, name);
        pst.execute();
        resultSet.close();
        pst.close();
        connection.close();
    }

    void ProfileName() throws IOException {
        SendInfo(type);
        SendInfo(name);
    }

    void ProfileNPost() throws IOException {
        SendInfo(type);
        SendInfo(name);
        SendInfo(postname);
    }

    void FetchTeacher() throws IOException, SQLException {

        connection = JavaDbConnect.dbConnect(catagory);
        String sql = "select Username from Teacher";
        pst = connection.prepareStatement(sql);
        resultSet = pst.executeQuery();
        while (resultSet.next()) {
                q = resultSet.getString("Username");
                System.out.println(q);
                SendInfo(q);
                }
        SendInfo("");
        resultSet.close();
        pst.close();
        connection.close();
    
    }
    
    void FetchPost() throws IOException, SQLException {
        String[] FilePile = new String[10];
        File path = new File("D:\\FeedBacks\\" +GetInfo());

        File[] files = path.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                String x = files[i].getName();
                SendInfo(x);
                System.out.println(files[i]);
            }
        }
        SendInfo("");
    }
    
//Main Brace
}

public class MainServer {

    public static void main(String[] args) throws IOException {
        ServerSocket ss;
        Socket s;
        ss = new ServerSocket(3333);

        while (true) {
            s = ss.accept();
            new ConnectionThread(s);
        }
    }
}
