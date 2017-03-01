#!/bin/bash

old_version=$1
new_version=$2

find . -type f -name "pom.xml" -exec sed -i '' -e "s/$old_version/$new_version/g" {} +
