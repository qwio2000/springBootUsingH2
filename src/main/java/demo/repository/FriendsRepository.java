package demo.repository;

import org.springframework.data.repository.CrudRepository;

import demo.model.Friends;

public interface FriendsRepository extends CrudRepository<Friends, Long> {
	Friends findByUserId(String userId);
}
