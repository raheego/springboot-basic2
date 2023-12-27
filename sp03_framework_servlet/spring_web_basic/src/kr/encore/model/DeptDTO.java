package kr.encore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeptDTO {  // model - ~VO, ~DTO, ~TO
	
	private int deptno;
	private String dname, loc;
	
}
