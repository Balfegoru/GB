# Staff = "B	B	B	B	B	B	B	B	-	-	-	-	B	B	B	B	E	E	E	E	M	M	M	M	G	G	B	B	B	B	B	B	B	B	-	-	-	-	M	G	-	-	M	M	M	M	M	M	-	-	B	M	M"
# Staff = Staff.split()
# Sword = "E	E	E	E	-	-	-	-	M	M	-	-	-	-	-	-	M	M	G	G	E	E	E	E	E	E	M	M	M	M	E	E	E	E	M	M	M	M	M	M	M	M	-	-	-	-	-	-	-	-	-	-	-"
# Sword = Sword.split()
# Dagger = "E	E	E	E	-	-	-	-	M	M	-	-	M	M	M	M	E	E	E	E	E	E	E	E	E	E	E	E	E	E	E	E	E	E	M	M	G	G	E	E	M	G	E	E	E	E	E	E	-	-	-	E	E"
# Dagger = Dagger.split()
# # Dagger = ""
# # Dagger = Dagger.split()
# Light = "-	-	B	-	-	-	G	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	B	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	G	-	-	-	M	M	M"
# Light = Light.split()
# Dark = "-	-	-	B	-	-	-	G	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	B	-	-	-	-	-	-	-	-	-	-	-	-	-	-	M	G	-	G	-	-	M	M	M"
# Dark = Dark.split()
# All = ""
# for i in range(len(Sword)):
#     if Sword[i] == "G":
#         print(f"Sword {i} and {Sword[i]} and {classes[i]}")
        
# for i in range(len(Dagger)):
#     if Dagger[i] == "G":
#         print(f"Dagger {i} and {Dagger[i]} and {classes[i]}")

# for i in range(len(Light)):
#     if Light[i] == "G":
#         print(f"Light {i} and {Light[i]} and {classes[i]}") 

# for i in range(len(Dark)):
#     if Dark[i] == "G":
#         print(f"Dark {i} and {Dark[i]} and {classes[i]}")  

strin1 = "Archer WarriorMage MasterArcher Sniper Cleric	Priest	PriestLight	PriestDark	DarkElf	Patriarch	Dragon	GreatWyrm	Druid	GreatDruid	Warlock	ArchDruid	Knight	Cavalier	BlackKnight	Champion	Minotaur	MinotaurLord	Monk	Initiate	Master	Ninja	Paladin	Crusader	Hero	Villain	Ranger	Hunter	BountyHunter	RangerLord	Thief	Rogue	Assassin	Spy	 Troll	WarTroll	Vampire	Nosferatu	Sorcerer	Wizard	Necromancer	Lich ArchMage DarkArchmage Peasant n/u HighPriest MasterWizard n/u"
classes = strin1.split()

print (len(classes))

# for i in range(len(Staff)):
#     if Staff[i] == "G":
#         print(f"Staff {i} and {Staff[i]} and {classes[i]}")
listAll = []
dictAll = {}
nameSkills = []
with open('A:/GITRep/Python/All/AllSkills.txt') as f_all:

    index = 0
    for i in f_all:
        nameSkills.append(i.split().pop(0))
        gradeSkills = i.split()
        del gradeSkills[0]       
        dictAll[nameSkills[index]] = gradeSkills
        index+=1
    
# print(f"Classes {len(classes)} , Grade {len(gradeSkills)}")

lista = []
for key, value in dictAll.items():
    # print(f"{key}: {value}")
    for i in range(len(value)):
        if value[i] == "G" and key != 'Blaster':
            print(f"{key},{i} {classes[i]},{value[i]}")


# for key, value in dictAll.items():
#     # print(f"{key}: {value}")
#     for i in range(len(value)):
#         if value[i] == "B" and key != 'Blaster':
#             print(f"{key},{i} {classes[i]},{value[i]}")


