package com.as.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@ToString
@ConfigurationProperties(prefix = "per.info")
public class PersonInfo {

	private String name;
	private Integer pid;
	private String[] favColor;
	private List<String> studies;
	private Set<Long> phoneNumbers;
	private Map<String,String> idDetails;
	private JobDetails jobInfo;
}
