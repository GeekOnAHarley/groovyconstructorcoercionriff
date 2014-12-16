class Koan4 extends Specification {

	def "Your fourth note: Show that coercion required a declared type..."() {
		when:
		def date = []
		
		then:
		date != null
		date instanceof Date
		// Prove that 'date' is now in fact a List
	}
}