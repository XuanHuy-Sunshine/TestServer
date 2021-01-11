package java;
// chú ý: Phải Chỉnh Sửa lại url : ở CSDL Lấy từ CSDl nào  

//Class.forName("com.mysql.jdbc.Driver");// lỗi do đặt sai Class ko nằm trong gói public class ... này dc 
// --> nó phải nằm trong 1 hàm con nữa vd: public static ....()

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSDL {
	private static Connection con;
	public static Connection getCon() {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://ec2-35-172-246-19.compute-1.amazonaws.com/df01ehg47oqr9q"; //host/db
			try {
				con = DriverManager.getConnection(url,"aorbddjozdmgii","189fc56c4e9772a0febf2d84c4cb0f318471c10ef2722dc143232c7792ccc6c3");
			} catch (SQLException e) {
				//Lỗi sai khi lấy sai link , tên SQL, mật khẩu
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			//Lỗi sai Thư Viện mysql 
			e.printStackTrace();
		}
		
		return con;
	}
	
//	public static void main(String[] args) {
//		Connection kn = CSDL.getCon();
//	}
	
}

