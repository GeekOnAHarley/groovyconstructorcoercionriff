class Koan2 extends Specification {

	def "Your second note: Achieve the same with coercion..."() {
		when:
		Date date = null // Add in a list coercion using []
		
		then:
		date != null
		date instanceof Date
	}
}