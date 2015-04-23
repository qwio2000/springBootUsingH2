package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.model.Friends;
import demo.repository.FriendsRepository;

@SpringBootApplication
public class SeungYeopH2Application implements CommandLineRunner{

	@Autowired
	FriendsRepository repository;
	
    public static void main(String[] args) {
        SpringApplication.run(SeungYeopH2Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
    	// TODO Auto-generated method stub
    	repository.save(new Friends("qwio2000","전승엽"));
    	repository.save(new Friends("abcd","하하하"));
    	repository.save(new Friends("test","테스트"));
    	repository.save(new Friends("gildong","홍길동"));
    	repository.save(new Friends("dodo","김도도"));
    	
    	System.out.println("모든 친구들 출력");
    	System.out.println("===============");
    	for (Friends friends : repository.findAll()) {
			System.out.println(friends);
		}
    }
}
