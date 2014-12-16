class Koan3 extends Specification {

	def "Your fourth note: Show that coercion required a declared type..."() {
		when:
		def date = []
		
		then:
		date != null
		date instanceof List
	}
}