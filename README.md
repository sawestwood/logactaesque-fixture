logactaesque-fixture
====================

Logactaesque Fixture Service

This references a deployed version of [logactaesque-game](https://github.com/sawestwood/logactaesque-game) to 'play' a series of fixtures. At the moment, the service plays a full season of fixtures for a league comprising only four teams.

Jan 2024
After some NINE years:
* Migrated this to use **spring-boot-starter-parent** artefact version 3.2.1
* Moved code to JDK17 (although no new Java features referenced yet)
* All the existing tests compile and work using Junit 4 with the **junit-vintage-engine** artefact
* At the moment, references an obsolete URL in relation to [logactaesque-game](https://github.com/sawestwood/logactaesque-game) when run, so will not function.
