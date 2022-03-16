import subprocess
return_code = subprocess.call(['javac'])
print("Output of call() : ", return_code)