package collab.todo

class Keyword {

	static belongsTo = Todo
	static hasMany = Todo
	
    static constraints = {
    }
}
