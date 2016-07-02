(ns plibmttbhgaty.core
  (:gen-class))

(defn divBy [x y]
	(if	( = (mod y x) 0) true false))

(defn fizzBuzz [x]
	(if (= 0 x) 0
		(if	(divBy 15 x)
			"fizzBuzz" 
			(if	(divBy 5 x) 
				"buzz" 
				(if (divBy 3 x) 
					"fizz"
					x )))))

(defn -main [& args]
  (doall 
  	(for [x (map fizzBuzz (take 20 (range)))]
	(println x))))

