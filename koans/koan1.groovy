class Koan1 extends Specification {

	def "Your first note: Use a regular, explicit constructor call..."() {
		when:
		Date date = null // use a regular, explicit constructor call to create a Date object
		
		then:
		date != null
		date instanceof Date
	}
}