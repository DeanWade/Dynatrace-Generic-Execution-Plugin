<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Generic Execution Plugin</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
    <meta content="Scroll Wiki Publisher" name="generator"/>
    <link type="text/css" rel="stylesheet" href="css/blueprint/liquid.css" media="screen, projection"/>
    <link type="text/css" rel="stylesheet" href="css/blueprint/print.css" media="print"/>
    <link type="text/css" rel="stylesheet" href="css/content-style.css" media="screen, projection, print"/>
    <link type="text/css" rel="stylesheet" href="css/screen.css" media="screen, projection"/>
    <link type="text/css" rel="stylesheet" href="css/print.css" media="print"/>
</head>
<body>
                <h1>Generic Execution Plugin</h1>
<ol class=" "><li class=" ">    <p>
    <h3  id="11567190_GenericExecutionPlugin-Overview"  >Overview</h3>
    </p>
</li></ol>    <p>
            <img src="images_community/download/attachments/11567190/icon.png" alt="images_community/download/attachments/11567190/icon.png" class="confluence-embedded-image" />
            </p>
    <p>
The Generic Execution Plugin <strong class=" ">executes any configurable command or web service</strong>            <img src="images_community/download/attachments/11567190/new.png" alt="images_community/download/attachments/11567190/new.png" class="confluence-embedded-image" />
    .<br/>It can be used as a Monitor, Task or Action depending on if a measurement should be received, a task should be regularly performed or a command/web service should be executed in case of an incident.<br/>If used as a monitor it matches the command's/web service's output against a regular expression and simply returns a success state if a match was found.    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
Name    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<strong class=" ">Generic Execution Plugin</strong>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Description    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<strong class=" ">New with Plugin for dynaTrace 4.1:</strong><br/>Arguments can be passed to the command. Argument placeholders are allowed to query the execution environment.<br/><br/>Monitors: {HOST} (with braces) represents the target host.<br/>Actions: {AGENT}, {APPSRV}, {DTSERVER}, {MSG}, {MEASURES}, {PROFILE}, {SEVERITY}, {SOURCE}, {STATE} (0 Open, 1 Closed, 2 Opened then Closed), {START}, {END}, {DURATION}, {RULE}, {RULEDESC}    </p>
    <p>
<strong class=" ">New with plugin version 5.5.0:</strong>    </p>
<ol class=" "><li class=" ">    <p>
Fixes plugin hanging bug    </p>
</li><li class=" ">    <p>
Plugin allows now to execute commands remotely for Unix/AIX/Linux based servers. No need to have dynaTrace Collector deployed on the server where command should be executed.    </p>
</li><li class=" ">    <p>
Includes functionality of the <a href="https://community.compuwareapm.com/community/display/DL/SSH+Action+Plugin">SSH Action</a> plugin. It is recommended to use the Generic Execution plugin instead of the <a href="https://community.compuwareapm.com/community/display/DL/SSH+Action+Plugin">SSH Action</a> plugin.    </p>
</li><li class=" ">    <p>
Maintains 105 external <a href="attachments_140115972_1_List_of_maintained_by_Action_plugins_predefined_variables_v5.5.0.docx">variables</a> that can be used by the command. It is the same list of maintained variables that is supported by the <a href="https://community.compuwareapm.com/community/display/DL/Extended+EMail+Action+Plugin">Extended Email Action</a> plugin.    </p>
</li><li class=" ">    <p>
Performs shell quoting for the special characters in the maintained external variables.    </p>
</li><li class=" ">    <p>
Slight change in syntax of variables: instead of the old style {variable-name} plugin supports ${variable-name} syntax.    </p>
</li><li class=" ">    <p>
Removed the Arguments parameter of the plugin. The Command parameter of the plugin now contains command&rsquo;s arguments.    </p>
</li><li class=" ">    <p>
Added Date Format parameter to format START_TIME and END_TIME variables. Default values is &quot;yyyy/MM/dd-HH:mm.ss zzz&quot;. If Date Format is blank, the default locale format is used.    </p>
</li></ol>    <p>
Below is information about maintained variables which are available when plugin is used as an action, monitor, or task.<br/><strong class=" ">Action</strong>: maintains 105 predefined variables which have the following syntax ${variable-name} (with dollar-sign and braces). The complete list of maintained variables is located <a href="attachments_140115972_1_List_of_maintained_by_Action_plugins_predefined_variables_v5.5.0.docx">here</a>.<br/><strong class=" ">Monitor or Task</strong>: ${HOST} (with dollar-sign and braces) represents the target host, ${PORT} (with dollar-sign and braces) represents the target port    </p>
    <p>
<strong class=" ">New with plugin versions 5.5.1 - 5.5.4:</strong>    </p>
<ol class=" "><li class=" ">    <p>
The Generic Execution plugin can execute any web service now.    </p>
</li><li class=" ">    <p>
Added &quot;Run Web Service?&quot; parameter to the parameters list.    </p>
<ol class=" "><li class=" ">    <p>
When &quot;Run Web Service?&quot; parameter is set to &quot;false&quot;, old Generic Execution parameters are displayed and command will be executed by Action, Monitor, or Task    </p>
</li><li class=" ">    <p>
When &quot;Run Web Service?&quot; parameter is set to &quot;true&quot;, parameters related to web service are displayed and web service will be executed by Action, Monitor, or Task    </p>
</li></ol></li><li class=" ">    <p>
Web Service parameters are shown in the screenshot below. WS WSDL, WS Operation, and WS Parameters are mandatory parameters.    </p>
            <img src="images_community/download/attachments/11567190/plugins-parameters.png" alt="images_community/download/attachments/11567190/plugins-parameters.png" class="" />
        </li><li class=" ">    <p>
WS Parameter contains key/value pairs depicted on the screenshot below. They are used for substitution of keys with correspondent values. Values can contain any of 111 predefined variables from the list <a href="https://community.compuwareapm.com/community/display/DL/Extended+EMail+Action+Plugin">here</a>. Predefined variables should be embedded in the value using the following format: ${variable-name}. Keys are names of simple data types of web service parameters which are passed in the SOAP message.    </p>
            <img src="images_community/download/attachments/11567190/ws-parameters.png" alt="images_community/download/attachments/11567190/ws-parameters.png" class="" />
        </li><li class=" ">    <p>
Plugin recognizes complex and simple data types based on provided wsdl for web services    </p>
</li><li class=" ">    <p>
Example of the SOAP message is attached below:    </p>
            <img src="images_community/download/attachments/11567190/soap-message-example.png" alt="images_community/download/attachments/11567190/soap-message-example.png" class="" />
        </li><li class=" ">    <p>
In order for the plugin to work, please remove outdated jaxws-api.jar, jaxb-api.jar, jaxb-impl.jar, jaxb-xjc.jar, stax-ex.jar, and streambuffer.jar file from the &lt;dt-home&gt;/server/lib/endorsed directory. This should be done for dynaTrace 5.5 and lower.    </p>
</li></ol>    <p>
<strong class=" ">New with plugin version </strong>5.5.5    </p>
    <p>
Added &quot;RC Measure&quot; parameter which contains name of the dynamic measure associated with the return value from the executed command. User of the plugin now has ability to draw charts which contains meaningful information about returned values from the executed command. User of the plugin can setup incident rules using base returnCode measure. Incidents will be triggered when dynamic measure will violate at least one threshold which is set in the incident rules for the base measure.    </p>
    <p>
<strong class=" ">New with plugin version </strong>5.5.6    </p>
<ol class=" "><li class=" ">    <p>
Optional parameters of the web service which have no values will be skipped in the SOAP message hence making SOAP message shorter.    </p>
</li><li class=" ">    <p>
Cosmetic changes in the plugin.xml file which simplify plugin configuration parameters screen.    </p>
</li><li class=" ">    <p>
Added outputBufferSize parameter to handle size of the stdout and stderr streams. Default value is 2048 bytes.    </p>
</li></ol>    <p>
<strong class=" ">New with plugin version </strong><strong class=" ">5.5.7</strong>    </p>
<ol class=" "><li class=" ">    <p>
Added support for JAX WS web services built with Apache Axis2 and CXF runtimes.    </p>
</li><li class=" ">    <p>
Added isDotNET parameter to handle .NET built SOAP web services. This parameter should be set to 'true&quot; for .NET web services.    </p>
</li><li class=" ">    <p>
Added &quot;WS Use Prefix&quot; parameter to indicate if prefixes will be used in the payload. When set to &quot;true&quot; prefixes will be added to the payload.    </p>
</li></ol>    <p>
<strong class=" ">New with plugin version </strong><strong class=" ">5.5.7.1            <img src="images_community/download/attachments/11567190/new.png" alt="images_community/download/attachments/11567190/new.png" class="confluence-embedded-image" />
    </strong>    </p>
<ol class=" "><li class=" ">    <p>
Minor release: added better diagnostics to the plugin.    </p>
</li></ol>    <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Plug-In Version    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
5.5.7.1    </p>
    <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Compatible with    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
dynaTrace 4.2, 5.0, 5.5+    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Author    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Ardeshir Arfaian (<a href="mailto:ardeshir.arfaian@dynatrace.com">ardeshir.arfaian@dynatrace.com</a>), Rob Vollum (<a href="mailto:rob.vollum@dynatrace.com">rob.vollum@dynatrace.com</a>),<br/>Eugene Turetsky (<a href="mailto:eugene.turetsky@compuware.com">eugene.turetsky@compuware.com</a>) versions 5.5.0 - 5.5.7    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
License    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<a href="attachments_5275722_2_dynaTraceBSD.txt">dynaTrace BSD</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Support    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<a href="https://community/display/DL/Support+Levels">Not Supported</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Downloads    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<strong class=" ">Download plug-in</strong>    </p>
    <p>
<a href="attachments_176095383_1_com.dynatrace.diagnostics.plugin.extended.GenericExecutionPlugin_5.5.7.1.jar">Generic Execution Plugin with support of Web Services v.5.5.7.1</a>             <img src="images_community/download/attachments/11567190/new0.png" alt="images_community/download/attachments/11567190/new0.png" class="confluence-embedded-image" />
        <br/><a href="attachments_71598081_1_com.dynatrace.diagnostics.plugins.GenericExecutionPlugin_4.1.0.jar">Generic Execution Plugin v 4.1</a><br/><a href="attachments_39518958_1_com.dynatrace.diagnostics.plugin.GenericExecutionPlugin.jar">Generic Execution Plugin v.3.5</a><br/><a href="attachments_12091398_1_com.dynatrace.diagnostics.plugins.GenericExecutionPlugin_3.0.1.1597.jar">Generic Execution Plugin v.3.x</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Key benefits    </p>
            </td>
                <td rowspan="1" colspan="1">
    <ul class=" "><li class=" ">    <p>
Generic use case scenarios: Execute any web service or shell command.    </p>
</li><li class=" ">    <p>
The plugin is very flexible. Can be used as a monitor, task or/and action.    </p>
</li><li class=" ">    <p>
Easy customizable to fit to your needs.    </p>
</li><li class=" ">    <p>
Integrates with dynaTrace 3+, centrally deploy to globally distributed collectors    </p>
</li><li class=" ">    <p>
Open Source: adapt the Generic Execution Plugin to your needs    </p>
</li></ul>            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Key features    </p>
            </td>
                <td rowspan="1" colspan="1">
    <ul class=" "><li class=" ">    <p>
execute any web service or command    </p>
</li><li class=" ">    <p>
configurable as monitor, task or action (in case of an incident)    </p>
</li><li class=" ">    <p>
ability to recognize simple and complex data types for web services    </p>
</li><li class=" ">    <p>
automatic generation of SOAP messages based on wsdl file for web services    </p>
</li><li class=" ">    <p>
pass multiple arguments to command    </p>
</li><li class=" ">    <p>
regex match on command's output    </p>
</li><li class=" ">    <p>
set timeout for command    </p>
</li><li class=" ">    <p>
configurable success condition: match / no match is success    </p>
</li><li class=" ">    <p>
chartable success state    </p>
</li><li class=" ">    <p>
alerting on success state    </p>
</li><li class=" ">    <p>
OS independent    </p>
</li><li class=" ">    <p>
depending on settings captures no/last 2048/first 2048 chars of command output    </p>
</li></ul>            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Limitations    </p>
            </td>
                <td rowspan="1" colspan="1">
    <ul class=" "><li class=" ">    <p>
plugin does not take care of hanging process/child processes    </p>
</li><li class=" ">    <p>
no limitations/checks about what command is started and the consequences of this command    </p>
</li></ul>            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Technical overview    </p>
            </td>
                <td rowspan="1" colspan="1">
    <ul class=" "><li class=" ">    <p>
JAX-WS software stack    </p>
</li><li class=" ">    <p>
OS independent    </p>
</li></ul>            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Install Description    </p>
            </td>
                <td rowspan="1" colspan="1">
    <ol class=" "><li class=" ">    <p>
Open dynaTrace Server preferences (right click on dynaTrace Server Node in cockpit and then select preferences from context menu).    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/open_server_preferences.png" alt="images_community/download/attachments/11567190/open_server_preferences.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
</li><li class=" ">    <p>
Import Generic Execution Plugin    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/import_plugin.png" alt="images_community/download/attachments/11567190/import_plugin.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
</li><li class=" ">    <p>
Activate Generic Execution Plugin in dynaTrace Server preferences.    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/server_preferences.png" alt="images_community/download/attachments/11567190/server_preferences.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
</li><li class=" ">    <p>
Adapt server-wide plug-in properties    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/serverwide_plugin_properties.png" alt="images_community/download/attachments/11567190/serverwide_plugin_properties.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
    <p>
In the server-wide plug-in properties (dynaTrace Server preferences &gt;&gt; Plug-ins) you can edit the default values and set the state. Every newly added Generic Execution Plugin will receive these default values. You can choose between &quot;Edit&quot;, &quot;Read&quot; or &quot;Hidden&quot;, so the default Settings can be edited, read-only or are not visible in the individual Generic Execution Plugin settings.    </p>
</li></ol>            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Setup Monitor / Task    </p>
            </td>
                <td rowspan="1" colspan="1">
    <ol class=" "><li class=" ">    <p>
<strong class=" ">How to create a Generic Execution Monitor / Generic Execution Task</strong>    </p>
<ol class=" "><li class=" ">    <p>
Open System Profile &gt;&gt; Preferences    </p>
</li><li class=" ">    <p>
Choose &quot;Monitors&quot; or &quot;Tasks&quot; from the configuration panel (Property Navigation)    </p>
</li><li class=" ">    <p>
Choose Add...    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/AddMonitor.png" alt="images_community/download/attachments/11567190/AddMonitor.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
</li><li class=" ">    <p>
Choose Generic Execution Monitor / Task from available Types    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/SelectMonitor.png" alt="images_community/download/attachments/11567190/SelectMonitor.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
</li><li class=" ">    <p>
Rename your Generic Execution Monitor / Task and adapt description    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/AddNewGEP.png" alt="images_community/download/attachments/11567190/AddNewGEP.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
</li><li class=" ">    <p>
Confirm.    </p>
</li></ol></li><li class=" ">    <p>
<strong class=" ">How to schedule a</strong> <strong class=" ">Generic Execution Monitor / Generic Execution Task</strong>    </p>
<ol class=" "><li class=" ">    <p>
Open System Profile &gt;&gt; Preferences    </p>
</li><li class=" ">    <p>
Choose &quot;Monitors&quot; or &quot;Tasks&quot; from the configuration panel (Property Navigation)    </p>
</li><li class=" ">    <p>
Select the Monitor/Task you wish to edit and click &quot;Edit...&quot; button    </p>
</li><li class=" ">    <p>
Preferences dialog opens.    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/Schedule.png" alt="images_community/download/attachments/11567190/Schedule.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
</li><li class=" ">    <p>
Select a predefined schedule or create your own schedule if none fits.    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/Schedule2.png" alt="images_community/download/attachments/11567190/Schedule2.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
</li><li class=" ">    <p>
Confirm.    </p>
</li></ol></li><li class=" ">    <p>
<strong class=" ">How to configure a</strong> <strong class=" ">Generic Execution Monitor / Generic Execution Task</strong>    </p>
<ol class=" "><li class=" ">    <p>
Open System Profile &gt;&gt; Preferences    </p>
</li><li class=" ">    <p>
Choose &quot;Monitors&quot; or &quot;Tasks&quot; from the configuration panel (Property Navigation)    </p>
</li><li class=" ">    <p>
Select the Monitor/Task you wish to edit and click &quot;Edit..&quot; button    </p>
</li><li class=" ">    <p>
Select the &quot;Settings&quot; tab    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/Settings1.png" alt="images_community/download/attachments/11567190/Settings1.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
</li><li class=" ">    <p>
You can now configure:    </p>
<ol class=" "><li class=" ">    <p>
Command - The command to execute.    </p>
</li><li class=" ">    <p>
Arguments - Argument(s) which should be passed to command.    </p>
</li><li class=" ">    <p>
Regular Expression - The regular expression the command's output should be matched against.    </p>
</li><li class=" ">    <p>
Capture Output - Defines if the output of the executed command should be captured and returned as message.    </p>
</li><li class=" ">    <p>
Success Definition - Defines condition under which monitor returns success: if regular expression matches or not.    </p>
</li></ol></li></ol></li><li class=" ">    <p>
<strong class=" ">How to centrally deploy a</strong> <strong class=" ">Generic Execution Monitor</strong> <strong class=" ">to different global locations</strong>    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/collector_selection.png" alt="images_community/download/attachments/11567190/collector_selection.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
    <p>
In general monitors always run on dynaTrace Collectors. Like presented in the previous screenshot you can decide centrally from your dynaTrace Client (in the monitor's settings) on which Collector a specific Monitor Task should run on.    </p>
    <blockquote>
    <p>
<i class=" ">Note: Tasks are always executed on the server, Monitors are executed on a collector.</i>    </p>
        </blockquote>
</li><li class=" ">    <p>
<strong class=" ">How to test, run, suspend a</strong> <strong class=" ">Generic Execution Monitor / Generic Execution Task</strong>    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/RunSuspend1.png" alt="images_community/download/attachments/11567190/RunSuspend1.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
</li></ol>            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Setup Action    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Please see &quot;Actions&quot; in <a href="Generic_Execution_Plugin.html">How to Setup Alerting</a> (dynaTrace 3.0 documentation)    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Usage    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<strong class=" ">Restart IIS</strong>    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/sample_restart_iis.png" alt="images_community/download/attachments/11567190/sample_restart_iis.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
    <p>
<strong class=" ">Ping a network address</strong>    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/sample_ping_dynatrace.png" alt="images_community/download/attachments/11567190/sample_ping_dynatrace.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
    <p>
Click to enlarge result:    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/sample_ping_result.png" alt="images_community/download/attachments/11567190/sample_ping_result.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
    <p>
<strong class=" ">List running windows services</strong>    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/sample_list_running_service.png" alt="images_community/download/attachments/11567190/sample_list_running_service.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
    <p>
<strong class=" ">Start/Stop a windows service</strong>    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/11567190/sample_stop_win_service.png" alt="images_community/download/attachments/11567190/sample_stop_win_service.png" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Known Problems    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
none    </p>
            </td>
        </tr>
</tbody>        </table>
            </div>
    <p>
    </p>
    <div class="tablewrap">
        <table>
<thead class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
&nbsp;    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<a href="Generic_Execution_Plugin.html">File</a>    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<a href="Generic_Execution_Plugin.html">Modified</a>    </p>
            </td>
        </tr>
</thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="1">
        <p>
Java Source                    <a href="https://community/download/attachments/11567190/com.dynatrace.diagnostics.plugin.extended.GenericExecutionPlugin_5.5.7.1.jar?api=v2">com.dynatrace.diagnostics.plugin.ex&hellip;</a>Version 5.5.7.1    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Aug 29, 2014by<a href="    /community/display/~eugene.turetsky@compuware.com ">Eugene Turetsky</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="2">
        <p>
    </p>
    <p>
Labels    </p>
<ul class="label-list has-pen "><li class="no-labels-message ">    <p>
No labels    </p>
</li><li class="labels-edit-container ">    <p>
<a href="Generic_Execution_Plugin.html">Edit Labels</a>    </p>
</li></ul>    <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="1">
        <p>
Java Source                    <a href="https://community/download/attachments/11567190/com.dynatrace.diagnostics.plugin.extended.GenericExecutionPlugin_5.5.7.jar?api=v2">com.dynatrace.diagnostics.plugin.ex&hellip;</a>GE plugin version 5.5.7 with web services support    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Jul 23, 2014by<a href="    /community/display/~eugene.turetsky@compuware.com ">Eugene Turetsky</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="2">
        <p>
    </p>
    <p>
Labels    </p>
<ul class="label-list has-pen "><li class="no-labels-message ">    <p>
No labels    </p>
</li><li class="labels-edit-container ">    <p>
<a href="Generic_Execution_Plugin.html">Edit Labels</a>    </p>
</li></ul>    <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="1">
        <p>
Java Source                    <a href="https://community/download/attachments/11567190/com.dynatrace.diagnostics.plugin.extended.GenericExecutionPlugin_5.5.6.jar?api=v2">com.dynatrace.diagnostics.plugin.ex&hellip;</a>GE plugin version 5.5.6 with web services support    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
May 07, 2014by<a href="    /community/display/~eugene.turetsky@compuware.com ">Eugene Turetsky</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="2">
        <p>
    </p>
    <p>
Labels    </p>
<ul class="label-list has-pen "><li class="no-labels-message ">    <p>
No labels    </p>
</li><li class="labels-edit-container ">    <p>
<a href="Generic_Execution_Plugin.html">Edit Labels</a>    </p>
</li></ul>    <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="1">
        <p>
Java Source                    <a href="https://community/download/attachments/11567190/com.dynatrace.diagnostics.plugin.extended.GenericExecutionPlugin_5.5.5.jar?api=v2">com.dynatrace.diagnostics.plugin.ex&hellip;</a>GE plugin version 5.5.5 with web services support    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Mar 31, 2014by<a href="    /community/display/~eugene.turetsky@compuware.com ">Eugene Turetsky</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="2">
        <p>
    </p>
    <p>
Labels    </p>
<ul class="label-list has-pen "><li class="no-labels-message ">    <p>
No labels    </p>
</li><li class="labels-edit-container ">    <p>
<a href="Generic_Execution_Plugin.html">Edit Labels</a>    </p>
</li></ul>    <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="1">
        <p>
Java Source                    <a href="https://community/download/attachments/11567190/com.dynatrace.diagnostics.plugin.extended.GenericExecutionPlugin_5.5.4.jar?api=v2">com.dynatrace.diagnostics.plugin.ex&hellip;</a>GE plugin version 5.5.4 with web services support    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Mar 07, 2014by<a href="    /community/display/~eugene.turetsky@compuware.com ">Eugene Turetsky</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="2">
        <p>
    </p>
    <p>
Labels    </p>
<ul class="label-list has-pen "><li class="no-labels-message ">    <p>
No labels    </p>
</li><li class="labels-edit-container ">    <p>
<a href="Generic_Execution_Plugin.html">Edit Labels</a>    </p>
</li></ul>    <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="1">
        <p>
Java Source                    <a href="https://community/download/attachments/11567190/com.dynatrace.diagnostics.plugin.extended.GenericExecutionPlugin_5.5.3.jar?api=v2">com.dynatrace.diagnostics.plugin.ex&hellip;</a>GE plugin version 5.5.3 with web services support    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Feb 09, 2014by<a href="    /community/display/~eugene.turetsky@compuware.com ">Eugene Turetsky</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="2">
        <p>
    </p>
    <p>
Labels    </p>
<ul class="label-list has-pen "><li class="no-labels-message ">    <p>
No labels    </p>
</li><li class="labels-edit-container ">    <p>
<a href="Generic_Execution_Plugin.html">Edit Labels</a>    </p>
</li></ul>    <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="1">
        <p>
Java Source                    <a href="https://community/download/attachments/11567190/com.dynatrace.diagnostics.plugin.extended.GenericExecutionPlugin_5.5.2.jar?api=v2">com.dynatrace.diagnostics.plugin.ex&hellip;</a>GE plugin version 5.5.2 with web services support    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Dec 27, 2013by<a href="    /community/display/~eugene.turetsky@compuware.com ">Eugene Turetsky</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="2">
        <p>
    </p>
    <p>
Labels    </p>
<ul class="label-list has-pen "><li class="no-labels-message ">    <p>
No labels    </p>
</li><li class="labels-edit-container ">    <p>
<a href="Generic_Execution_Plugin.html">Edit Labels</a>    </p>
</li></ul>    <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="1">
        <p>
Java Source                    <a href="https://community/download/attachments/11567190/com.dynatrace.diagnostics.plugin.extended.GenericExecutionPlugin_5.5.1.jar?api=v2">com.dynatrace.diagnostics.plugin.ex&hellip;</a>GE plugin version 5.5.1 with web services support    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Dec 04, 2013by<a href="    /community/display/~eugene.turetsky@compuware.com ">Eugene Turetsky</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="2">
        <p>
    </p>
    <p>
Labels    </p>
<ul class="label-list has-pen "><li class="no-labels-message ">    <p>
No labels    </p>
</li><li class="labels-edit-container ">    <p>
<a href="Generic_Execution_Plugin.html">Edit Labels</a>    </p>
</li></ul>    <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="1">
        <p>
Java Source                    <a href="https://community/download/attachments/11567190/com.dynatrace.diagnostics.plugin.extended.GenericExecutionPlugin_5.5.0.jar?api=v2">com.dynatrace.diagnostics.plugin.ex&hellip;</a>Version 5.5.0    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Oct 25, 2013by<a href="    /community/display/~eugene.turetsky@compuware.com ">Eugene Turetsky</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="2">
        <p>
    </p>
    <p>
Labels    </p>
<ul class="label-list has-pen "><li class="no-labels-message ">    <p>
No labels    </p>
</li><li class="labels-edit-container ">    <p>
<a href="Generic_Execution_Plugin.html">Edit Labels</a>    </p>
</li></ul>    <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="1">
        <p>
Java Source                    <a href="https://community/download/attachments/11567190/com.dynatrace.diagnostics.plugins.GenericExecutionPlugin_4.1.0.jar?api=v2">com.dynatrace.diagnostics.plugins.G&hellip;</a>Updated Executor Plugin for dynaTrace 4.1    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Feb 07, 2012by<a href="    /community/display/~andreas.grabner@compuware.com ">Andreas Grabner</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="2">
        <p>
    </p>
    <p>
Labels    </p>
<ul class="label-list has-pen "><li class="no-labels-message ">    <p>
No labels    </p>
</li><li class="labels-edit-container ">    <p>
<a href="Generic_Execution_Plugin.html">Edit Labels</a>    </p>
</li></ul>    <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="1">
        <p>
Java Source                    <a href="https://community/download/attachments/11567190/com.dynatrace.diagnostics.plugin.GenericExecutionPlugin.jar?api=v2">com.dynatrace.diagnostics.plugin.Ge&hellip;</a>    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Nov 02, 2010by<a href="    /community/display/~stefan.frandl@compuware.com ">Stefan Frandl</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="2">
        <p>
    </p>
    <p>
Labels    </p>
<ul class="label-list has-pen "><li class="no-labels-message ">    <p>
No labels    </p>
</li><li class="labels-edit-container ">    <p>
<a href="Generic_Execution_Plugin.html">Edit Labels</a>    </p>
</li></ul>    <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="1">
        <p>
Java Source                    <a href="https://community/download/attachments/11567190/com.dynatrace.diagnostics.plugins.GenericExecutionPlugin_3.0.1.1597.jar?api=v2">com.dynatrace.diagnostics.plugins.G&hellip;</a>    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Mar 10, 2009by<a href="    /community/display/~ardeshir.arfaian@compuware.com ">Ardeshir Arfaian</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="2">
        <p>
    </p>
    <p>
Labels    </p>
<ul class="label-list has-pen "><li class="no-labels-message ">    <p>
No labels    </p>
</li><li class="labels-edit-container ">    <p>
<a href="Generic_Execution_Plugin.html">Edit Labels</a>    </p>
</li></ul>    <p>
    </p>
            </td>
        </tr>
</tbody>        </table>
            </div>
<ul class=" "><li class="drop-zone-text hidden ">    <p>
Drag and drop to upload or browse for files    </p>
            <img src="images_community/images/icons/wait.gif" alt="images_community/images/icons/wait.gif" class="plugin_attachments_dropzone_uploadwaiticon" />
        </li></ul>    <p>
Upload fileFile description<a href="https://community/pages/downloadallattachments.action?pageId=11567190">Download All</a>    </p>
            </div>
        </div>
        <div class="footer">
        </div>
    </div>
</body>
</html>
