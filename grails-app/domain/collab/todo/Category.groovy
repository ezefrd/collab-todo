package collab.todo

class Category {

	String name
	String description
	User owner
	
	static belongsTo = User
	static hasMany = [todos:Todo]
    static constraints = {
    	name(blank:false)
	}
	
	String toString(){
		name
	}
}
