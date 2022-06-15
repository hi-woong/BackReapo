package com.bk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
	
	private String id;
	private String pw;
	private int sex;
	private int age;
	private String memlocation;
}
