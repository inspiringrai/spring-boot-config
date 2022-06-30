package com.springboot.config.repository;

import com.springboot.config.domain.MyProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author TTDKOC
 *
 */
@Repository
public interface PropertiesRepository extends JpaRepository<MyProperties, Integer> {

	public List<MyProperties> findByApplication(String application);

	public List<MyProperties> findByApplicationAndProfile(String application, String profile);

	public List<MyProperties> findByApplicationAndProfileAndLabel(String application, String profile, String label);

	public List<MyProperties> findByApplicationAndProfileAndLabelAndKey(String application, String profile,
																		String label, String key);

	public Optional<MyProperties> findOneByApplicationAndProfileAndLabelAndKey(String application, String profile,
																			   String label, String key);

}
