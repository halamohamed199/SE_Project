package socialnetworkapi;

import java.util.HashMap;

public class APICont {
    public boolean createUser(HashMap<String,String> data){
        return User.signUp(data);        
    }
    
    public boolean makeAPost(String text){
        User user = User.getCurrentActiveUser();
        UserPost post = new UserPost();
        post.setUser(user);
        PrivatePost ppost = new PrivatePost(post);
        return ppost.savePost();
    }

    public boolean sendFriendRequest(User user){
        User activeUser = User.getCurrentActiveUser();
        activeUser.sendFriendRequest(user);
        return true;
    }
}


/*
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://localhost/Bankdatabase";//database name

// Database credentials
static final String USER = "root";
static final String PASS = "";

Connection conn=null;
Statement stmt =null;
PreparedStatement pst = null;

try {

// STEP 2: Register JDBC driver
    Class.forName("com.mysql.jdbc.Driver");

    conn = DriverManager.getConnection(DB_URL, USER, PASS);
    stmt = conn.createStatement();

    ////////////////////////////////////////////////////
      String sql2 = "select  username from client";//client is table name
    ResultSet rs = stmt.executeQuery(sql2);
    // STEP 5: Extract data from result set
    while (rs.next()) {
            // Retrieve by column name
            String name = rs.getString("Username");//column name
        System.out.println(name);

    }

    rs.close();



    conn.close();
    stmt.close();
    pst.close();

}
catch(ClassNotFoundException e){
    //System.out.println("error");

}catch(SQLException e)
{
    //    System.out.println("sql error");

}
*/