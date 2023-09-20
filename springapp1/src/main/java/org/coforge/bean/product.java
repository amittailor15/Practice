package org.coforge.bean;

import lombok.Data;
import java.util.*;

@Data
public class product {
	private int prdid;
	private String prdname;
	private float prcost;
	
	private List<String> prlist;
	private Set<String> bikeset;
	
	private Map<String,String> carmap;
	
}
