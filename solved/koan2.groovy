class Koan2 extends Specification {

	def "Your second note: Achieve the same with coercion..."() {
		when:
		Date date = []
		
		then:
		date != null
		date instanceof Date
	}
}