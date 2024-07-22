package in.prashuIT.service;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.prashuIT.entity.Parshu;
import in.prashuIT.img.ImageUtil;
import in.prashuIT.repo.ParshuRepo;

@Service
public class ParshuService {
	
	@Autowired
	private ParshuRepo parshuRepo;

	public ParshuService(ParshuRepo parshuRepo) {
		this.parshuRepo = parshuRepo;
	}
	
	public void saveParshu() throws IOException {
		Parshu p = new Parshu();
		p.setName("Parshuram goud");
		p.setDob("15/03/2002");
		p.setGender("male");
		
		byte[] imageData = ImageUtil.readImageFile("C:\\Users\\admin\\Downloads\\IMG20240112082535.jpg");
		p.setImage(imageData);
		
		byte[] resumeData = ImageUtil.readImageFile("C:\\Users\\admin\\Downloads\\Parshuram_Goud_Resume.pdf");
		p.setReasume(resumeData);
		
		parshuRepo.save(p);
		
	}
		
	

}
