(ns pokemon.pokemons
  (:require [clojure.string :as string]))

(def pokedex
  [{:id 1   :name "Bulbasaur"  :type "Grass"    :evolution-id 2}
   {:id 2   :name "Ivysaur"    :type "Grass"    :evolution-id 3}
   {:id 3   :name "Venusaur"   :type "Grass"    :evolution-id 3}
   {:id 4   :name "Charmander" :type "Fire"     :evolution-id 5}
   {:id 5   :name "Charmeleon" :type "Fire"     :evolution-id 6}
   {:id 6   :name "Charizard"  :type "Fire"     :evolution-id 6}
   {:id 7   :name "Squirtle"   :type "Water"    :evolution-id 8}
   {:id 8   :name "Wartortle"  :type "Water"    :evolution-id 9}
   {:id 9   :name "Blastoise"  :type "Water"    :evolution-id 9}
   {:id 10  :name "Caterpie"   :type "Bug"      :evolution-id 11}
   {:id 11  :name "Metapod"    :type "Bug"      :evolution-id 12}
   {:id 12  :name "Butterfree" :type "Bug"      :evolution-id 12}
   {:id 13  :name "Weedle"     :type "Bug"      :evolution-id 14}
   {:id 14  :name "Kakuna"     :type "Bug"      :evolution-id 15}
   {:id 15  :name "Beedrill"   :type "Bug"      :evolution-id 15}
   {:id 16  :name "Pidgey"     :type "Normal"   :evolution-id 17}
   {:id 17  :name "Pidgeotto"  :type "Normal"   :evolution-id 18}
   {:id 18  :name "Pidgeot"    :type "Normal"   :evolution-id 18}
   {:id 19  :name "Rattata"    :type "Normal"   :evolution-id 20}
   {:id 20  :name "Raticate"   :type "Normal"   :evolution-id 20}
   {:id 21  :name "Spearow"    :type "Normal"   :evolution-id 22}
   {:id 22  :name "Fearow"     :type "Normal"   :evolution-id 22}
   {:id 23  :name "Ekans"      :type "Poison"   :evolution-id 24}
   {:id 24  :name "Arbok"      :type "Poison"   :evolution-id 24}
   {:id 25  :name "Pikachu"    :type "Electric" :evolution-id 26}
   {:id 26  :name "Raichu"     :type "Electric" :evolution-id 26}
   {:id 27  :name "Sandshrew"  :type "Ground"   :evolution-id 28}
   {:id 28  :name "Sandslash"  :type "Ground"   :evolution-id 28}
   {:id 29  :name "Nidoran♀"   :type "Poison"   :evolution-id 30}
   {:id 30  :name "Nidorina"   :type "Poison"   :evolution-id 31}
   {:id 31  :name "Nidoqueen"  :type "Poison"   :evolution-id 31}
   {:id 32  :name "Nidoran♂"   :type "Poison"   :evolution-id 33}
   {:id 33  :name "Nidorino"   :type "Poison"   :evolution-id 34}
   {:id 34  :name "Nidoking"   :type "Poison"   :evolution-id 34}
   {:id 35  :name "Clefairy"   :type "Fairy"    :evolution-id 36}
   {:id 36  :name "Clefable"   :type "Fairy"    :evolution-id 36}
   {:id 37  :name "Vulpix"     :type "Fire"     :evolution-id 38}
   {:id 38  :name "Ninetales"  :type "Fire"     :evolution-id 38}
   {:id 39  :name "Jigglypuff" :type "Normal"   :evolution-id 40}
   {:id 40  :name "Wigglytuff" :type "Normal"   :evolution-id 40}
   {:id 41  :name "Zubat"      :type "Poison"   :evolution-id 42}
   {:id 42  :name "Golbat"     :type "Poison"   :evolution-id 42}
   {:id 43  :name "Oddish"     :type "Grass"    :evolution-id 44}
   {:id 44  :name "Gloom"      :type "Grass"    :evolution-id 45}
   {:id 45  :name "Vileplume"  :type "Grass"    :evolution-id 45}
   {:id 46  :name "Paras"      :type "Bug"      :evolution-id 47}
   {:id 47  :name "Parasect"   :type "Bug"      :evolution-id 47}
   {:id 48  :name "Venonat"    :type "Bug"      :evolution-id 49}
   {:id 49  :name "Venomoth"   :type "Bug"      :evolution-id 49}
   {:id 50  :name "Diglett"    :type "Ground"   :evolution-id 51}
   {:id 51  :name "Dugtrio"    :type "Ground"   :evolution-id 52}
   {:id 52  :name "Meowth"     :type "Normal"   :evolution-id 53}
   {:id 53  :name "Persian"    :type "Normal"   :evolution-id 54}
   {:id 54  :name "Psyduck"    :type "Water"    :evolution-id 55}
   {:id 55  :name "Golduck"    :type "Water"    :evolution-id 55}
   {:id 56  :name "Mankey"     :type "Fighting" :evolution-id 57}
   {:id 57  :name "Primeape"   :type "Fighting" :evolution-id 57}
   {:id 58  :name "Growlithe"  :type "Fire"     :evolution-id 59}
   {:id 59  :name "Arcanine"   :type "Fire"     :evolution-id 59}
   {:id 60  :name "Poliwag"    :type "Water"    :evolution-id 61}
   {:id 61  :name "Poliwhirl"  :type "Water"    :evolution-id 62}
   {:id 62  :name "Poliwrath"  :type "Water"    :evolution-id 63}
   {:id 63  :name "Abra"       :type "Psychic"  :evolution-id 64}
   {:id 64  :name "Kadabra"    :type "Psychic"  :evolution-id 65}
   {:id 65  :name "Alakazam"   :type "Psychic"  :evolution-id 66}
   {:id 66  :name "Machop"     :type "Fighting" :evolution-id 67}
   {:id 67  :name "Machoke"    :type "Fighting" :evolution-id 68}
   {:id 68  :name "Machamp"    :type "Fighting" :evolution-id 68}
   {:id 69  :name "Bellsprout" :type "Grass"    :evolution-id 70}
   {:id 70  :name "Weepinbell" :type "Grass"    :evolution-id 71}
   {:id 71  :name "Victreebel" :type "Grass"    :evolution-id 71}
   {:id 72  :name "Tentacool"  :type "Water"    :evolution-id 73}
   {:id 73  :name "Tentacruel" :type "Water"    :evolution-id 73}
   {:id 74  :name "Geodude"    :type "Rock"     :evolution-id 75}
   {:id 75  :name "Graveler"   :type "Rock"     :evolution-id 76}
   {:id 76  :name "Golem"      :type "Rock"     :evolution-id 76}
   {:id 77  :name "Ponyta"     :type "Fire"     :evolution-id 78}
   {:id 78  :name "Rapidash"   :type "Fire"     :evolution-id 78}
   {:id 79  :name "Slowpoke"   :type "Water"    :evolution-id 80}
   {:id 80  :name "Slowbro"    :type "Water"    :evolution-id 80}
   {:id 81  :name "Magnemite"  :type "Electric" :evolution-id 82}
   {:id 82  :name "Magneton"   :type "Electric" :evolution-id 82}
   {:id 83  :name "Farfetch"   :type "Normal"   :evolution-id 83}
   {:id 84  :name "Doduo"      :type "Normal"   :evolution-id 84}
   {:id 85  :name "Dodrio"     :type "Normal"   :evolution-id 84}
   {:id 86  :name "Seel"       :type "Water"    :evolution-id 87}
   {:id 87  :name "Dewgong"    :type "Water"    :evolution-id 87}
   {:id 88  :name "Grimer"     :type "Poison"   :evolution-id 89}
   {:id 89  :name "Muk"        :type "Poison"   :evolution-id 89}
   {:id 90  :name "Shellder"   :type "Water"    :evolution-id 91}
   {:id 91  :name "Cloyster"   :type "Water"    :evolution-id 91}
   {:id 92  :name "Gastly"     :type "Ghost"    :evolution-id 93}
   {:id 93  :name "Haunter"    :type "Ghost"    :evolution-id 94}
   {:id 94  :name "Gengar"     :type "Ghost"    :evolution-id 94}
   {:id 95  :name "Onix"       :type "Rock"     :evolution-id 95}
   {:id 96  :name "Drowzee"    :type "Psychic"  :evolution-id 97}
   {:id 97  :name "Hypno"      :type "Psychic"  :evolution-id 97}
   {:id 98  :name "Krabby"     :type "Water"    :evolution-id 99}
   {:id 99  :name "Kingler"    :type "Water"    :evolution-id 99}
   {:id 100 :name "Voltorb"    :type "Electric" :evolution-id 101}
   {:id 101 :name "Electrode"  :type "Electric" :evolution-id 101}
   {:id 102 :name "Exeggcute"  :type "Grass"    :evolution-id 103}
   {:id 103 :name "Exeggutor"  :type "Grass"    :evolution-id 103}
   {:id 104 :name "Cubone"     :type "Ground"   :evolution-id 105}
   {:id 105 :name "Marowak"    :type "Ground"   :evolution-id 105}
   {:id 106 :name "Hitmonlee"  :type "Fighting" :evolution-id 106}
   {:id 107 :name "Hitmonchan" :type "Fighting" :evolution-id 107}
   {:id 108 :name "Lickitung"  :type "Normal"   :evolution-id 108}
   {:id 109 :name "Koffing"    :type "Poison"   :evolution-id 110}
   {:id 110 :name "Weezing"    :type "Poison"   :evolution-id 110}
   {:id 111 :name "Rhyhorn"    :type "Ground"   :evolution-id 112}
   {:id 112 :name "Rhydon"     :type "Ground"   :evolution-id 112}
   {:id 113 :name "Chansey"    :type "Normal"   :evolution-id 113}
   {:id 114 :name "Tangela"    :type "Grass"    :evolution-id 114}
   {:id 115 :name "Kangaskhan" :type "Normal"   :evolution-id 115}
   {:id 116 :name "Horsea"     :type "Water"    :evolution-id 117}
   {:id 117 :name "Seadra"     :type "Water"    :evolution-id 117}
   {:id 118 :name "Goldeen"    :type "Water"    :evolution-id 119}
   {:id 119 :name "Seaking"    :type "Water"    :evolution-id 119}
   {:id 120 :name "Staryu"     :type "Water"    :evolution-id 121}
   {:id 121 :name "Starmie"    :type "Water"    :evolution-id 121}
   {:id 122 :name "Mr. Mime"   :type "Psychic"  :evolution-id 122}
   {:id 123 :name "Scyther"    :type "Bug"      :evolution-id 123}
   {:id 124 :name "Jynx"       :type "Ice"      :evolution-id 124}
   {:id 125 :name "Electabuzz" :type "Electric" :evolution-id 125}
   {:id 126 :name "Magmar"     :type "Fire"     :evolution-id 126}
   {:id 127 :name "Pinsir"     :type "Bug"      :evolution-id 127}
   {:id 128 :name "Tauros"     :type "Normal"   :evolution-id 128}
   {:id 129 :name "Magikarp"   :type "Water"    :evolution-id 130}
   {:id 130 :name "Gyarados"   :type "Water"    :evolution-id 130}
   {:id 131 :name "Lapras"     :type "Water"    :evolution-id 131}
   {:id 132 :name "Ditto"      :type "Normal"   :evolution-id 132}
   {:id 133 :name "Eevee"      :type "Normal"   :evolution-id [134 135 136]}
   {:id 134 :name "Vaporeon"   :type "Water"    :evolution-id 134}
   {:id 135 :name "Jolteon"    :type "Electric" :evolution-id 135}
   {:id 136 :name "Flareon"    :type "Fire"     :evolution-id 136}
   {:id 137 :name "Porygon"    :type "Normal"   :evolution-id 137}
   {:id 138 :name "Omanyte"    :type "Rock"     :evolution-id 139}
   {:id 139 :name "Omastar"    :type "Rock"     :evolution-id 139}
   {:id 140 :name "Kabuto"     :type "Rock"     :evolution-id 141}
   {:id 141 :name "Kabutops"   :type "Rock"     :evolution-id 141}
   {:id 142 :name "Aerodactyl" :type "Rock"     :evolution-id 142}
   {:id 143 :name "Snorlax"    :type "Normal"   :evolution-id 143}
   {:id 144 :name "Articuno"   :type "Ice"      :evolution-id 144}
   {:id 145 :name "Zapdos"     :type "Electric" :evolution-id 145}
   {:id 146 :name "Moltres"    :type "Fire"     :evolution-id 146}
   {:id 147 :name "Dratini"    :type "Dragon"   :evolution-id 148}
   {:id 148 :name "Dragonair"  :type "Dragon"   :evolution-id 149}
   {:id 149 :name "Dragonite"  :type "Dragon"   :evolution-id 149}
   {:id 150 :name "Mewtwo"     :type "Psychic"  :evolution-id 150}
   {:id 151 :name "Mew"        :type "Psychic"  :evolution-id 151}])

(defn types
  [pokemons]
  (->> pokemons
       (map :type)
       distinct))

(defn type-with-pokemons
  [type pokemons-string]
  (str
   "\""
   type
   " pokemons\": "
   pokemons-string))

(defn pokemons-by-type
  [type pokemons]
  (->> pokemons
       (filter #(= type (:type %)))
       (map :name)
       (string/join ", ")
       (type-with-pokemons type)))

(defn initialize-types
  [result current]
  (assoc result current []))

(defn populate-types-with-pokemons
  [result current]
  (assoc
   result
   (:type current)
   (conj (get result (:type current)) (:name current))))

(defn map-type-with-list-of-pokemons
  [pokemons]
  (reduce
   populate-types-with-pokemons
   (reduce initialize-types {} (types pokemons))
   pokemons))

(defn evolve
  [pokemons pokemon]
  (->> pokemons
       (filter #(= (:evolution-id pokemon) (:id %)))
       (first)
       :name
       (str (:name pokemon) "->")))
