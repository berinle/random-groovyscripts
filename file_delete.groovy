def parentPath = '/Users/berinle/workspace/scratch'
def fileName = "hello.txt"
def sleeptime = 3 //in secs

def file = new File(new File("$parentPath"), "$fileName")
if(!file.exists()){
	file << 'yo gabagaba'
	println "creating a file ${file.name}"	
}

def f = new File(new File("$parentPath"), "$fileName")
println "sleeping for $sleeptime secs before deleting..."
Thread.sleep(sleeptime * 1000)
println "Waking from sleep"
f.delete()
println "Done deleting"