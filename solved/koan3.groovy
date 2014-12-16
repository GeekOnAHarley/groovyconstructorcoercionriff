class Koan25 extends Specification {

	def "Your third note: Achieve the same with coercion and parameters..."() {
		when:
		Date date = [76,4,25]
		
		then:
		date != null
		date instanceof Date
		date.date == 25
		date.month == 4
		date.year == 76
	}
}