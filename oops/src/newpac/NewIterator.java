package newpac;

ArrayList<String> al = new ArrayList<String>(); 

al.add("C"); 
al.add("A"); 
al.add("E"); 
al.add("B"); 
al.add("D"); 
al.add("F"); 

// iterate through the list
System.out.print("Original contents of al: "); 

Xxxxxxxx<Xxxxxx> itr = al.xxxxxxxx(); 
while(itr.xxxXxxx()) { 
  String element = itr.xxxx(); 
  System.out.print(element + " "); 
} 
System.out.println(); 

// Modify objects being iterated. 
XxxxXxxxxxxx<Xxxxxx> litr = al.xxxxXxxxxxxx();  
while(litr.xxxXxxx()) { 
  String element = litr.xxxx(); 
  litr.xxx(element + "+"); 
} 

System.out.print("Modified contents of al: "); 
itr = al.xxxxxxxx();  
while(itr.xxxXxxx()) { 
  String element = itr.xxxx(); 
  System.out.print(element + " "); 
} 
System.out.println(); 

// Now, display the list backwards. 
System.out.print("Modified list backwards: "); 
while(litr.xxxXxxxxxxx()) { 
  String element = litr.xxxxxxxx(); 
  System.out.print(element + " "); 
} 
System.out.println();
