class Park{
	
String parkName;
int noOfParksInCity;
double noOfBenches;
float noOfGates;
String securityGuard;
int guardAge;
int experience;
float guardSalary;
double noOfGymItems;
Park(String parkName)
{
	
	System.out.println("invoking parkname const in park");
	
}
Park(String parkName,int noOfParksInCity)
{
	this(parkName);
	this.noOfParksInCity=noOfParksInCity;
	System.out.println("invoking parkname,noOfParksInCity const in park");
	
}
Park(String parkName,int noOfParksInCity,double noOfBenches)
{
	this(parkName,noOfParksInCity);
	this.noOfBenches=noOfBenches;
	System.out.println("invoking parkname,noOfParksInCity,noOfBenches const in park");
	
}
Park(String parkName,int noOfParksInCity,double noOfBenches,float noOfGates)
{
	this(parkName,noOfParksInCity,noOfBenches);
	this.noOfGates=noOfGates;
	System.out.println("invoking parkname,noOfParksInCity,noOfBenches,noOfGates const in park");
	
}
Park(String parkName,int noOfParksInCity,double noOfBenches,float noOfGates,String securityGuard)
{
	this(parkName,noOfParksInCity,noOfBenches,noOfGates);
	this.securityGuard=securityGuard;
	System.out.println("invoking parkname,noOfParksInCity,noOfBenches,noOfGates,securityGuard const in park");
	
}
Park(String parkName,int noOfParksInCity,double noOfBenches,float noOfGates,String securityGuard,int guardAge)
{
	this(parkName,noOfParksInCity,noOfBenches,noOfGates,securityGuard);
	this.guardAge=guardAge;
	System.out.println("invoking parkname,noOfParksInCity,noOfBenches,noOfGates,securityGuard,guardAge const in park");
	
}
Park(String parkName,int noOfParksInCity,double noOfBenches,float noOfGates,String securityGuard,int guardAge,
int experience)
{
	this(parkName,noOfParksInCity,noOfBenches,noOfGates,securityGuard,guardAge);
	this.experience=experience;
	System.out.println("invoking parkname,noOfParksInCity,noOfBenches,noOfGates,securityGuard,guardAge const in park");
	
}
Park(String parkName,int noOfParksInCity,double noOfBenches,float noOfGates,String securityGuard,int guardAge,
int experience,float guardSalary)
{
	this(parkName,noOfParksInCity,noOfBenches,noOfGates,securityGuard,guardAge,experience);
	this.guardSalary=guardSalary;
	System.out.println("invoking parkname,noOfParksInCity,noOfBenches,noOfGates,securityGuard,guardAge,guardSalary 
	const in park");
	
}

Park(String parkName,int noOfParksInCity,double noOfBenches,float noOfGates,String securityGuard,int guardAge,
int experience,float guardSalary,double noOfGymItems)
{
	this(parkName,noOfParksInCity,noOfBenches,noOfGates,securityGuard,guardAge,experience,guardSalary);
	this.noOfGymItems=noOfGymItems;
	System.out.println("invoking parkname,noOfParksInCity,noOfBenches,noOfGates,securityGuard,guardAge,guardSalary, 
	noOfGymItems const in park");
	
}













}