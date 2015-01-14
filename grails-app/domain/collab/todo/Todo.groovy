package collab.todo

class Todo {
	
	static belongsTo = [User,Category]
	static hasMany = Keyword
	static mapping = {
		table 'todo_tbl',
		columns{
			name column:'name_str'
			note column:'note_str'
			name index:'Name_Idx, Name_Create_Date_Idx'
			createDate index:'Name_Create_Date_Idx'
		}
		version false
	}
	
	String name
	String note
	Date createdDate
	Date dueDate
	Date completedDate
	String priority
	String status
	User owner
	Category category
	
	
    static constraints = {
    	name(blank:false)
		createdDate()
		priority()
		status()
		note(maxSize:1000, nullable:true)
		completedDate(nullable:true)
		dueDate(nullable:true)
	}
	
	String toString(){
		name
	}
}
