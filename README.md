# Low-level Implementierung mit verteilten Objekten
### Peter Fuchs V12062018

## 1 Einführung
Diese Übung soll die Verwendung von Frameworks zur Umsetzung von low-level Implementierungen mit verteilten Objekten aufzeigen.

### 1.1 Ziele
Das Ziel dieser Übung ist der Einsatz von gängigen Enterprise-Frameworks in verschiedenen Tiers (View, BusinessLogic, Persistierung). Auf die Umsetzung der Skalierbarkeit, Verteilung und Wiederverwendung von Code wird besonders Wert gelegt. Dabei ist zu beachten, dass die einzelnen Teile unabhängig voneinander deployed werden können. Die Grundlagen zur Synchronisation und Replikation werden dabei näher erläutert.

### 1.2 Voraussetzungen
* Grundlagen einer höheren Programmiersprache
* Grundlegendes Verständnis über Entwicklungsumgebungen

### 1.3 Aufgabenstellung
Das Java Enterprise Framework ist kurz als Architektur zu beschreiben. Verwendete Quellen sind dabei auf jeden Fall entsprechend zu zitieren. Weiters ist die Installation eines Application-Servers und Deployment einer ausgewählten Beispielimplementierung zu beschreiben. Als wichtige Grundfunktionalität ist die Persistierung mittels einer geeigneten API zu implementieren. Um die Datenobjekte auch in entsprechenden Applikationen verwenden zu können, ist die Schnittstelle zwischen dieser API und der GUI zu beschreiben und zu implementieren.

Serverseitige Programmierung innerhalb des Frameworks ist mittels einer einfachen Authentifizierung und einer einfachen Gruppenrichtlinien zu demonstrieren. Dabei sollen auch Änderungen an den Datensätzen geloggt und täglich als Bericht generiert werden. Diese Berichte sollen dann auch per Email an die Administratoren weitergeleitet werden.

### 1.4 Bewertung
* Gruppengrösse: 1 Person
* Anforderungen "Grundkompetenz überwiegend erfüllt"
  * Grundlegende Beschreibung der vorgestellten Frameworkarchitektur
  * Application Server installieren und starten
  * Beispielprojekt deployen und starten
* Anforderungen "Grundkompetenz zur Gänze erfüllt"
  * Datenobjekte persistieren (Beispielprojekt frei wählbar)
* Anforderungen "Erweiterte-Kompetenz überwiegend erfüllt"
  * CRUD Funktionalität über grafische Oberfläche zur Modifikation von Datenobjekten
  * Authentifikation
* Anforderungen "Erweiterte-Kompetenz zur Gänze erfüllt"
  * Gruppenrichtlinien für Modifikationen der Datenobjekte
  * Versenden von täglichem Statusbericht über Änderungen an Datenbasis an Admin per Email

## 2 Abgabe
Abzugeben sind hier der Github-Link zur Beispiel-Implementierung. Die Dokumentation ist mittels der latex-protocol Vorlage aus dem TGM-HIT Github-Repository zu erstellen. Es wird dabei hier die erstellte PDF-Version des Protokolls als Dateiabgabe erwartet.

## 3 Quellen
* "Overview of Enterprise Applications"; Introduction to the Java EE Platform; Oracle; Online: https://javaee.github.io/firstcup/java-ee001.html
* "Distributed Multitiered Applications"; The Java EE Tutorial; Oracle; Online: https://javaee.github.io/tutorial/overview004.html
* "Tutorial Examples"; Oracle; Online: https://github.com/javaee/tutorial-examples
* "Java EE 8 - GlassFish 5 Download"; Oracle; Online: https://javaee.github.io/glassfish/download
