$kansio = ".\paketti"

# Toista tästä alemmas useampaan tiedostoon-------->
# Ohjelman nimi:
$nimi = "test"


$ohjelma = ".java"
$ohjelma = $nimi+$ohjelma 
$class = ".class"
$class = $nimi+$class

javac $ohjelma
mv $class $kansio
# <-------Toista tästä alemmas useampaan tiedostoon
# Ohjelman nimi:
$nimi2 = $null

$ohjelma = ".java"
$ohjelma = $nimi+$ohjelma 
$class = ".class"
$class = $nimi+$class

javac $ohjelma
mv $class $kansio
