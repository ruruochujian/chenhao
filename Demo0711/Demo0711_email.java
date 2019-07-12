package Demo0711;
/*
 * 定义一个网络用户类 成员变量有 用户ID、用户密码、email地址。有多样的构造方法
 */
public class Demo0711_email {
			int  id;
			String password;
			String email;
			
			
			public void showId(int id) {
				this.id=id;
			}
			
			public int showId() {
				return id;
			}
			
			public void showPsd(String password) {
				this.password=password;
			}
			
			public String showPsd() {
				return password;
			}
			
			public void showEmail(String email) {
				this.email=email;
			}
			
			public String showEmail() {
				return email;
			}
}
