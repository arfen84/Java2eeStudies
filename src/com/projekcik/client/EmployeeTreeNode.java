package com.projekcik.client;

import com.smartgwt.client.widgets.tree.TreeNode;

public class EmployeeTreeNode extends TreeNode{
	public EmployeeTreeNode(String employeeId, String reportsTo, String name) {  
        setEmployeeId(employeeId);  
        setReportsTo(reportsTo);  
        setName(name);  
    }  


public void setEmployeeId(String value) {  
    setAttribute("EmployeeId", value);  
}  

public void setReportsTo(String value) {  
    setAttribute("ReportsTo", value);  
}  

public void setName(String name) {  
   setAttribute("Name", name);  
} }