package spring5_webmvc_bean_validation_study.spring;

public class RegisterRequest {

		private String email;
		private String password;
		private String confirmPassword;
		private String name;
		
		public boolean isPasswordEqualToConfirmPassword() {
			return password.equals(confirmPassword);
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConfirmPassword() {
			return confirmPassword;
		}
		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return String.format("RegisterRequest [email=%s, password=%s, confirmPassword=%s, name=%s]", email,
					password, confirmPassword, name);
		}
		
	
		
		
}
