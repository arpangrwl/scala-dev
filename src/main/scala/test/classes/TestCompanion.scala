package test.classes

import scala.collection.mutable.ArrayBuffer

package subtest {
	class TestCompanion {
		private var names: ArrayBuffer[String] = TestCompanion.getNames

		def printNames = { for (name <- names) println(s"NAME: $name") }
	}
}

object TestCompanion {
	def getNames: ArrayBuffer[String] = {
		var names = ArrayBuffer[String]()
		names += ("Prithviraj", "Asher", "Abigail")
		names
	}
}

object TestCompanionDriver {
	import test.classes.subtest.TestCompanion

	def main(args: Array[String]) {
		val tc = new TestCompanion()
		tc.printNames
	}
}
