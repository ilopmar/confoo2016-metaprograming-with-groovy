class Utils {
}

def utilsInstance = new Utils()

Utils.metaClass.version = "3.0"
utilsInstance.metaClass.released = true


assert utilsInstance.version == "3.0"
assert utilsInstance.released == true
