package Demo0711;
/*
 * ����һ�������û��� ��Ա������ �û�ID���û����롢email��ַ���ж����Ĺ��췽��
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
