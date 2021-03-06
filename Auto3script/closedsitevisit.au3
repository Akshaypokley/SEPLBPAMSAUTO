#region --- Au3Recorder generated code Start (v3.3.9.5 KeyboardLayout=00000409)  ---

#region --- Internal functions Au3Recorder Start ---
Func _Au3RecordSetup()
Opt('WinWaitDelay',100)
Opt('WinDetectHiddenText',1)
Opt('MouseCoordMode',0)
Local $aResult = DllCall('User32.dll', 'int', 'GetKeyboardLayoutNameW', 'wstr', '')
If $aResult[1] <> '00000409' Then
  MsgBox(64, 'Warning', 'Recording has been done under a different Keyboard layout' & @CRLF & '(00000409->' & $aResult[1] & ')')
EndIf

EndFunc

Func _WinWaitActivate($title,$text,$timeout=0)
	WinWait($title,$text,$timeout)
	If Not WinActive($title,$text) Then WinActivate($title,$text)
	WinWaitActive($title,$text,$timeout)
EndFunc

_AU3RecordSetup()
#endregion --- Internal functions Au3Recorder End ---

_WinWaitActivate("Home - Google Chrome","")
MouseClick("left",766,499,1)
Sleep(4500)
MouseClick("left",763,528,1)
Sleep(4500)
MouseClick("left",760,565,1)
Sleep(4500)
MouseClick("left",760,595,1)
Sleep(4500)
MouseClick("left",743,678,1)
Sleep(4500)
MouseClick("left",584,620,1)
Sleep(4500)
MouseClick("left",589,713,2)
Sleep(4500)
Send("o")
MouseClick("left",1075,324,1)
Sleep(4500)
MouseClick("left",686,607,1)
Sleep(4500)
MouseMove(1267,424)
Sleep(4500)
MouseDown("left")
Sleep(4500)
MouseMove(1257,674)
Sleep(4500)
MouseUp("left")
Sleep(4500)
MouseMove(1283,560)
Sleep(4500)
MouseDown("left")
Sleep(4500)
MouseMove(1266,744)
Sleep(4500)
MouseUp("left")
Sleep(4500)
MouseClick("left",483,650,1)
Sleep(4500)
_WinWaitActivate("Attach File - Google Chrome","")
MouseClick("left",176,138,1)
Sleep(4500)
_WinWaitActivate("Attachments - Google Chrome","")
MouseClick("left",177,132,1)
Sleep(4500)
_WinWaitActivate("Open","")
Sleep(4500)
MouseClick("left",119,384,1)
Sleep(4500)
MouseClick("left",195,262,1)
Sleep(4500)
MouseClick("left",195,262,1)
Sleep(4500)
MouseClick("left",219,352,1)
Sleep(4500)
MouseClick("left",219,352,1)
Sleep(4500)
MouseClick("left",256,556,1)
Sleep(4500)
MouseClick("left",1092,695,1)
Sleep(4500)
_WinWaitActivate("Attach File - Google Chrome","")
MouseClick("left",402,112,1)
Sleep(4500)
_WinWaitActivate("Home - Google Chrome","")
MouseMove(1281,365)
Sleep(4500)
MouseDown("left")
Sleep(4500)
MouseMove(1263,144)
Sleep(4500)
MouseUp("left")
Sleep(4500)
MouseMove(1263,431)
Sleep(4500)
MouseDown("left")
Sleep(4500)
MouseMove(1235,170)
Sleep(4500)
MouseUp("left")
Sleep(4500)
MouseMove(1276,387)
Sleep(4500)
MouseDown("left")
Sleep(4500)
MouseMove(1237,187)
Sleep(4500)
MouseUp("left")
Sleep(4500)
MouseClick("left",1180,318,1)
Sleep(4500)
MouseClick("left",742,167,1)
Sleep(4500)
MouseClick("left",706,627,1)
Sleep(4500)
#endregion --- Au3Recorder generated code End ---
