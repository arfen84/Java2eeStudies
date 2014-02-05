package com.projekcik.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dev.jjs.ast.JLabel;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.data.fields.DataSourceTextField;
import com.smartgwt.client.types.DSDataFormat;
import com.smartgwt.client.types.Side;
import com.smartgwt.client.types.TreeModelType;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.events.DrawEvent;
import com.smartgwt.client.widgets.events.DrawHandler;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;
import com.smartgwt.client.widgets.tree.Tree;
import com.smartgwt.client.widgets.tree.TreeGrid;
import com.smartgwt.client.widgets.tree.TreeGridField;
import com.smartgwt.client.widgets.tree.TreeNode;


public class Zakladki implements EntryPoint {
	
	public void onModuleLoad() {
		
		DataSource dataSource = new DataSource("json.json");  
        dataSource.setDataFormat(DSDataFormat.JSON);  
        dataSource.getDataSource("json.json");
              	   
        DataSourceTextField nameField = new DataSourceTextField("imie", "Imie");  
        DataSourceTextField populationfield = new DataSourceTextField("nazwisko", "Nazwisko");  
        DataSourceTextField areaField = new DataSourceTextField("wiek", "Wiek");  
        DataSourceTextField governmentField = new DataSourceTextField("zawod", "Zawod");  
        DataSourceTextField governmentField2 = new DataSourceTextField("miasto", "Miasto");  
  
        dataSource.setFields(nameField, populationfield, areaField, governmentField, governmentField2);  
  
        ListGrid grid = new ListGrid();  
        grid.setDataSource(dataSource);  
        grid.setWidth(550);  
        grid.setHeight(550);  
        grid.setAutoFetchData(true);  
        grid.draw();
		
		
		
		
		
		
		
		
		
		
				
		TreeGrid treeGrid = new TreeGrid();  
        treeGrid.setWidth(300);  
       treeGrid.setHeight(400);  
  
        TreeGridField field = new TreeGridField("Name", "Tree from local data");  
        field.setCanSort(false);  
  
        treeGrid.setFields(field);  
  
        final Tree tree = new Tree();  
        tree.setModelType(TreeModelType.PARENT);  
        tree.setNameProperty("Name");  
        tree.setIdField("EmployeeId");  
        tree.setParentIdField("ReportsTo");  
        tree.setShowRoot(true);  
  
        
        
        
        EmployeeTreeNode root = new EmployeeTreeNode("4", "1", "My project");  
        EmployeeTreeNode node2 = new EmployeeTreeNode("188", "4", "src");  
        EmployeeTreeNode node22 = new EmployeeTreeNode("55", "188", "com.mycompany.public");
        EmployeeTreeNode node23 = new EmployeeTreeNode("21", "55", "js"); 
        EmployeeTreeNode node3 = new EmployeeTreeNode("189", "21", "Gwtext");  
        EmployeeTreeNode node4 = new EmployeeTreeNode("265", "188", "com.mycompany.client");
	    EmployeeTreeNode node28 = new EmployeeTreeNode("29", "4", "test"); 
        
        EmployeeTreeNode node6 = new EmployeeTreeNode("264", "188", "tomcat");
        EmployeeTreeNode node7 = new EmployeeTreeNode("123", "264", "conf");
        EmployeeTreeNode node71 = new EmployeeTreeNode("122", "264", "webapps");
        EmployeeTreeNode node72 = new EmployeeTreeNode("12", "264", "work");
        EmployeeTreeNode node73 = new EmployeeTreeNode("421", "264", "www");
        EmployeeTreeNode node74 = new EmployeeTreeNode("42", "264", "bin");
        tree.setData(new TreeNode[]{root, node2,node22,node23, node3, node4,node28, node6, node7, node71, node72, node73, node74});  
       
        treeGrid.addDrawHandler(new DrawHandler() {  
            public void onDraw(DrawEvent event) {  
                tree.openAll();  
            }  
        });  
          
        treeGrid.setData(tree);  
  
        treeGrid.draw();  
        
       
	    
		
		
		
		
		final Label rownasie = new Label("=");
		final TextBox nameField2 = new TextBox();
		final TextBox nameField3 = new TextBox();
		final TextBox wynik = new TextBox();
		 final Label lb = new Label("cosiki");
		
		 Button b = new Button("dodaj", new ClickHandler() {
		      public void onClick(ClickEvent event) {
		    	 float a=Float.parseFloat(nameField2.getValue());
		    	 float s=Float.parseFloat(nameField3.getValue());
		    	 float g=a+s;
		    	 String df = Float.toString(g);
		    	 wynik.setText(df);
		      }
		    });
		 
		 Button w = new Button("odejmij", new ClickHandler() {
		      public void onClick(ClickEvent event) {
		    	 float a=Float.parseFloat(nameField2.getValue());
		    	 float s=Float.parseFloat(nameField3.getValue());
		    	 float g=a-s;
		    	 String df = Float.toString(g);
		    	 wynik.setText(df);
		      }
		    });
		 Button e = new Button("pomnoz", new ClickHandler() {
		      public void onClick(ClickEvent event) {
		    	 float a=Float.parseFloat(nameField2.getValue());
		    	 float s=Float.parseFloat(nameField3.getValue());
		    	 float g=a*s;
		    	 String df = Float.toString(g);
		    	 wynik.setText(df);
		      }
		    });
		 
		 Button r = new Button("podziel", new ClickHandler() {
		      public void onClick(ClickEvent event) {
		    	 float a=Float.parseFloat(nameField2.getValue());
		    	 float s=Float.parseFloat(nameField3.getValue());
		    	 float g=a/s;
		    	 String df = Float.toString(g);
		    	 wynik.setText(df);
		      }
		    });

		 
				   
		   final TabSet topTabSet = new TabSet();  
	         topTabSet.setTabBarPosition(Side.TOP);  
	         topTabSet.setWidth(700);  
	         topTabSet.setHeight(900);  
	        
	         Tab tTab1 = new Tab("JSON");  
	         VLayout JSON = new VLayout();
	         JSON.addMember(grid);
	         tTab1.setPane(JSON);  
	   
	         Tab tTab2 = new Tab("Drzewo"); 
	         VLayout drzewo = new VLayout();
	         drzewo.addMember(treeGrid);
	         tTab2.setPane(drzewo); 
	       	        
	         Tab tTab3 = new Tab("Kalkulator"); 
	         
	         HLayout kalk = new HLayout();
	         HLayout kalk2 = new HLayout();
	         VLayout kalk3 = new VLayout();
	         VLayout kalk4 = new VLayout();
	         kalk.setMembersMargin(10);
	         kalk.addMember(nameField2);
	         kalk.addMember(nameField3);
	         kalk.addMember(rownasie);
	         kalk.addMember(wynik);
	         kalk2.addMember(b);
	         kalk2.addMember(w);
	         kalk2.addMember(e);
	         kalk2.addMember(r);
	         Label lg = new Label();
	         kalk4.addMember(lg);
	         kalk3.addMember(kalk);
	         kalk3.addMember(kalk2);
	         kalk3.addMember(kalk4);
	         tTab3.setPane(kalk3);  
	       
	         topTabSet.addTab(tTab1);  
	         topTabSet.addTab(tTab2); 
	         topTabSet.addTab(tTab3);
	   
	         final TabSet leftTabSet = new TabSet();  
	         leftTabSet.setTabBarPosition(Side.LEFT);  
	         leftTabSet.setWidth(400);  
	         leftTabSet.setHeight(200);  
	   
	         VLayout vLayout = new VLayout();  
	         vLayout.setMembersMargin(15);  
	         vLayout.addMember(topTabSet);  
	        
	         vLayout.addMember(leftTabSet);  
	         vLayout.setHeight("auto");  
	   
	         vLayout.draw();  
	     }
		   

	}

