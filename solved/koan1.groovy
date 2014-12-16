class Koan1 extends Specification {

	def "Your first note: Use a regular, explicit constructor call..."() {
		when:
		Date date = new Date()
		
		then:
		date != null
		date instanceof Date
	}
}
