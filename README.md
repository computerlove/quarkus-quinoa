# Quarkus Quinoa extension

[![Build](https://github.com/quarkiverse/quarkus-quinoa/workflows/Build/badge.svg)](https://github.com/quarkiverse/quarkus-quinoa/actions?query=workflow%3ABuild)
[![Maven Central](https://img.shields.io/maven-central/v/io.quarkiverse.quinoa/quarkus-quinoa.svg?label=Maven%20Central)](https://search.maven.org/artifact/io.quarkiverse.quinoa/quarkus-quinoa)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-5-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->

Quinoa is a Quarkus extension which eases the development, the build and serving of single page apps or web components (built with NodeJS: React, Angular, Vue, Lit, …) alongside Quarkus. It is possible to use it with a Quarkus backend in a single project.

You will be able to do live coding of the backend and frontend together nearly out of the box. In Quarkus dev mode, Quinoa will start the node live coding server provided by the target framework and forward relevant requests to it.

## Getting started

Read the full [Quinoa documentation](https://quarkiverse.github.io/quarkiverse-docs/quarkus-quinoa/dev/).

### Prerequisite

* Install NodeJS (https://nodejs.org/)
* Create or use an existing Quarkus application
* Add the Quinoa extension

### Installation

Create a new Quinoa project (with a base Quinoa starter code):

* With [code.quarkus.io](https://code.quarkus.io/?a=quinoa-bowl&j=17&e=io.quarkiverse.quinoa%3Aquarkus-quinoa)
* With the [Quarkus CLI](https://quarkus.io/guides/cli-tooling):
```bash
quarkus create app quinoa-app -x=io.quarkiverse.quinoa:quarkus-quinoa
```

Then start the live-coding:
```bash
quarkus dev
```

And navigate to http://0.0.0.0:8080/quinoa.html

You could also just add the extension (but you won't get the starter code):

* With the [Quarkus CLI](https://quarkus.io/guides/cli-tooling):
```bash
quarkus ext add io.quarkiverse.quinoa:quarkus-quinoa
```

## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tr>
    <td align="center"><a href="https://github.com/ia3andy"><img src="https://avatars.githubusercontent.com/u/2223984?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Andy Damevin</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-quinoa/commits?author=ia3andy" title="Code">💻</a> <a href="#maintenance-ia3andy" title="Maintenance">🚧</a></td>
    <td align="center"><a href="http://www.phillip-kruger.com"><img src="https://avatars.githubusercontent.com/u/6836179?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Phillip Krüger</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-quinoa/commits?author=phillip-kruger" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/rvansa"><img src="https://avatars.githubusercontent.com/u/2167869?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Radim Vansa</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-quinoa/commits?author=rvansa" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/fblan"><img src="https://avatars.githubusercontent.com/u/13745480?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Blanc Frederic</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-quinoa/commits?author=fblan" title="Code">💻</a></td> 
    <td align="center"><a href="https://github.com/andyhan"><img src="https://avatars.githubusercontent.com/u/142950?v=4?s=100" width="100px;" alt=""/><br /><sub><b>andyhan</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-quinoa/commits?author=andyhan" title="Code">💻</a></td>
  </tr>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!
