import std.stdio;
import std.path;
import std.file;

void main() {
	auto projects = getProjectsDir();
}

string getProjectsDir() {
    getcwd.writeln;
    return getcwd;
}
