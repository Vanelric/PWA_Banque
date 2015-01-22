#Bilan

###Fonctionnalités utilisable

####Partie 1
+ Spring Security

####Partie 2
+ Parcourir la liste des produits.
+ Filtrer la liste en fonction de la categorie.
+ Ajouter des catégories.
+ Ajouter/Supprimer des produits.
+ Ajouter/Supprimer des abonnements.
+ Souscrire à un abonnement.
+ Consulter les commandes (via url ou via un formulaire).

###Fonctionnalité non utilisable

####Partie 1

####Partie 2
+ Les catégories phares du moments sont implémentée statiquement.
  + Une solution serait de denombrer le nombre de produits disponibles dans chaque categorie et affcicher les 3 catégories les plus fournies.
  + Une autre solution serait la même mais avec le nombre de souscriptions.
+ Securité des données du serveur REST.
  + Il serait peut-être possible d'implémenter des comptes utilisateur et envoyer l'identifant à chaque requete rest et valider l'accès.
  + Une solution plus avancée serait d'utiliser SSL comme décrit [ici](https://arnaultjeanson.wordpress.com/2010/03/12/securiser-une-architecture-rest-avec-ssl/)

###Difficultés/Remarques

###Leçons apprises