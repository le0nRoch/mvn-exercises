# Alles Über Maven Artefakte

Dieses Repository dient zur Ergebnissicherung der Aufgaben _Maven Artefakte_ aus dem Modul _DevOps_.

## Aufgaben

- [Git Submodule](./git-submodules/doc.md)
- [Was ist ein Maven Artefakt?](#was-ist-ein-maven-artefakt)
- [Maven Repository](#maven-repository)
- [Maven Artefakt lokal nutzen](#maven-artefakt-lokal-nutzen)
- [Maven Artefakt auf GitHub veröffentlichen](#maven-artefakt-auf-github-ver%C3%B6ffentlichen)

## Was ist ein Maven Artefakt?

```xml
<project>
    <modelVersion>4.0.0</modelVersion> <!-- POM Version -->
    <groupId>org.baeldung</groupId> <!-- Gruppen ID <land>.<firma> -->
    <artifactId>org.baeldung.java</artifactId> <!-- Artefakt ID <land>.<firma>.<projekt> -->
    <packaging>jar</packaging> <!-- Verpackung jar = Java Archiv -->
    <version>1.0.0-SNAPSHOT</version> <!-- Version -->
    <name>org.baeldung.java</name> <!-- Name -->
    <url>http://maven.apache.org</url>
    <dependencies> <!-- Abhängigkeiten -->
        <dependency>
            <groupId>junit</groupId> <!-- Gruppen ID der Abhängigkeit -->
            <artifactId>junit</artifactId> <!-- Artefakt ID der Abhängigkeit -->
            <version>4.1.2</version> <!-- Version der Abhängigkeit (hier Stable) -->
            <scope>test</scope> <!-- Scope der Abhängigkeit -->
        </dependency>
    </dependencies>
</project>
```

**Classifier**:

Der Classifier ist ein optionaler Zusatz zum Artefakt. Er wird verwendet, um Artefakte mit gleicher Gruppen-ID, Artefakt-ID und Version zu unterscheiden. Ein Beispiel für die Verwendung eines Classifiers ist die Erstellung von Artefakten für verschiedene Plattformen. Ein Beispiel für einen Classifier ist: `org.baeldung.java:jar:1.0.0:tests`.

**Version**:

Die Version eines Artefakts ist eine Zeichenfolge, die die Version des Artefakts angibt. Die Version wird in der Regel in der Form `MAJOR.MINOR.PATCH` angegeben. Ein Beispiel für eine Version ist: `1.0.0`.

**Packaging**:

Das Packaging-Element gibt an, wie das Artefakt verpackt wird. Ein Beispiel für ein Packaging ist: `jar`.

**Group ID**:

Die Gruppen-ID ist eine Zeichenfolge, die die Gruppe identifiziert, die das Artefakt erstellt hat. Ein Beispiel für eine Gruppen-ID ist: `org.baeldung`. Meine Gruppen-ID ist: `ch.bbw`.

**Artifact ID**:

Die Artefakt-ID ist eine Zeichenfolge, die das Artefakt identifiziert. Ein Beispiel für eine Artefakt-ID ist: `org.baeldung.java`. Meine Artefakt-ID ist: `ch.bbw.<project>`.

Unterschied zwischen `SNAPSHOT` und `RELEASE`:

- `SNAPSHOT`: Eine SNAPSHOT-Version ist eine Version, die sich noch in der Entwicklung befindet. SNAPSHOT-Versionen können sich bei jedem Build ändern. Beispeile für SNAPSHOT-Versionen sind: `1.0.0-SNAPSHOT`, `1.0.1-SNAPSHOT`, `1.0.2-SNAPSHOT`.

- `RELEASE`: Eine RELEASE-Version ist eine Version, die für die Veröffentlichung bereit ist. RELEASE-Versionen sind stabil und sollten nicht geändert werden. Beispiele für RELEASE-Versionen sind: `1.0.0`, `1.0.1`, `1.0.2`.

## Maven Repository

**Lokales Repository auf Windows**:

```cmd
cd %USERPROFILE%\.m2\repository
```

Das Repository ist ein Verzeichnis hat eine Grösse von 1 GB.

## Maven Artefakt lokal nutzen

Als erstes habe ich ein Maven Projekt erstellt:

![Calculator](./calculator.png)

Es ist ein einfacher Taschenrechner, der zwei Zahlen addiert.
Ich musste noch dem Befehele `mvn install` ausführen, um das Artefakt in das lokale Repository zu installieren.

Als nächstes habe ich ein weiteres Maven Projekt erstellt und das erste Projekt als Abhängigkeit hinzugefügt:

![Calculator-App](./calculator-user.png)

Et voilà, ich konnte das Artefakt des ersten Projekts im zweiten Projekt verwenden.

## Maven Artefakt auf GitHub veröffentlichen
