package collab.todo

class User {
	static hasMany = [todos:Todo,categories:Category]

	static mapping = {
		columns {
			address lazy:false
		}
	}
	
	static transients = ["confirmPassword"]
		
	
	Address address
	String userName
	String firstName
	String lastName
	String email
	String password
	String confirmPassword
    
	static constraints = {
    	userName(blank:false,unique:true)
		firstName(blank:false)
		lastName(blank:false)
	}
	
	String toString(){
		"$firstName, $lastName"
	}
}
