@ECHO OFF
SETLOCAL
ECHO clone/update %P_URL% in "%P_FOLDER%"
IF EXIST %P_FOLDER% (
	ECHO "moving to %P_FOLDER%"
	CD "%P_FOLDER%"
	git clean -d  -fx
	ECHO "update remotes (fetch ^& pull)"
	git fetch -P -p -n -v -q --all
	git pull -v --progress --no-rebase --no-tags --prune "NFeCloud"
	ECHO "checking out to branch "current"."
	git checkout -f --track -B current remotes/NFeCloud/master
) ELSE (
	git clone --single-branch --no-tags --progress -v -o NFeCloud -b master "%P_URL%" "%P_FOLDER%"
	ECHO "moving to "%P_FOLDER%""
	CD "%P_FOLDER%"
	ECHO "create branch "current"."
	git branch -m current
)
:EXIT
ECHO #######################
ECHO DONE
ECHO #######################
ENDLOCAL