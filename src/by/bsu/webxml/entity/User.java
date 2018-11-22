package by.bsu.webxml.entity;
import java.sql.Blob;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.management.relation.Role;

public class User{
        private String department;
	    private String login;
	    private String password;
	    private String lastname;
	    private String firstname;
	    private String patronymic;
	    private String email;
	    private long phone;
	    private String city;
	    private String picture;
	    private Date date;
	    private Integer user_info_id;
	    private String text;
	    private String path_img;
	    private Integer price;
	    private Boolean status;
	    private Boolean isSell;
	    private Integer category_id;
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getPatronymic() {
			return patronymic;
		}
		public void setPatronymic(String patronymic) {
			this.patronymic = patronymic;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getPicture() {
			return picture;
		}
		public void setPicture(String picture) {
			this.picture = picture;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public Integer getUser_info_id() {
			return user_info_id;
		}
		public void setUser_info_id(Integer user_info_id) {
			this.user_info_id = user_info_id;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getPath_img() {
			return path_img;
		}
		public void setPath_img(String path_img) {
			this.path_img = path_img;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		public Boolean getStatus() {
			return status;
		}
		public void setStatus(Boolean status) {
			this.status = status;
		}
		public Boolean getIsSell() {
			return isSell;
		}
		public void setIsSell(Boolean isSell) {
			this.isSell = isSell;
		}
		public Integer getCategory_id() {
			return category_id;
		}
		public void setCategory_id(Integer category_id) {
			this.category_id = category_id;
		}
		@Override
		public String toString() {
			return "User [department=" + department + ", login=" + login + ", password=" + password + ", lastname="
					+ lastname + ", firstname=" + firstname + ", patronymic=" + patronymic + ", email=" + email
					+ ", phone=" + phone + ", city=" + city + ", picture=" + picture + ", date=" + date
					+ ", user_info_id=" + user_info_id + ", text=" + text + ", path_img=" + path_img + ", price="
					+ price + ", status=" + status + ", isSell=" + isSell + ", category_id=" + category_id + "]";
		}
	
}