{{#isList}}
{{>writeList}}
{{/isList}}
{{#isSet}}
{{>writeSet}}
{{/isSet}}
{{#isMap}}
{{>writeMap}}
{{/isMap}}
{{#isStruct}}
{{>writeStruct}}
{{/isStruct}}
{{#isEnum}}
{{>writeEnum}}
{{/isEnum}}
{{#isBase}}
{{>writeBase}}
{{/isBase}}