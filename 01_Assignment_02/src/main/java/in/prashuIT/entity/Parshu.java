package in.prashuIT.entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "Parshu_tbl")
public class Parshu {
	
	@Id
	private Integer id;
	private String name;
	private String dob;
	private String gender;
	
	@Lob
	@Column(length = 1000000)
	private byte[] image;
	
	@Lob
	@Column (length= 1000000)
	private byte[] reasume;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public byte[] getReasume() {
		return reasume;
	}

	public void setReasume(byte[] reasume) {
		this.reasume = reasume;
	}

	@Override
	public String toString() {
		return "Parshu [id=" + id + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", image="
				+ Arrays.toString(image) + ", reasume=" + Arrays.toString(reasume) + "]";
	}
	
    
}
