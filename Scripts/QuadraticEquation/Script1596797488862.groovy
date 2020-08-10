

def squareRoot(def input){
	Math.sqrt(input)
}
def calculateQuadraticEquation(def a, def b, def c){
	def root1
	def root2
	
	def determinant = b*b - 4*a*c
	
	println("DAY LA SO DETERMINANT ${determinant}")
	
	if(determinant > 0){
		root1 = (-b + squareRoot(determinant))/2*a
		
		root2 = (-b - squareRoot(determinant))/2*a
	}
	
	else if(determinant == 0){
		root1 = root2 = -b/2*a
	}
	
	else if(determinant <0){
		println("VO NGHIEM")
	}
	
	println("NGHIEM CUA BAN LA ${root1} ${root2}")
	
}


calculateQuadraticEquation(5, 6, 1)