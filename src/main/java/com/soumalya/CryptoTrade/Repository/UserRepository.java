package com.soumalya.CryptoTrade.Repository;



import com.soumalya.CryptoTrade.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
