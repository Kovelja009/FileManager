# FileStorageAPI
## Specification for FileStorageAPI
This project includes model and specification for API that will be
used to manipulate Local File Storage or Remote File Storage (in this case Google Drive).

Specification can be found in abstract class MyFileStorage along with description of
each method.
This project has covered a lot of basic and advanced file storage operations
including creation, deletion and editing of files and folders, BFS searching of files in
directories and subdirectories, searching for files with specific names, extensions, 
sorting of search results and also result filtering based on specified parameters.

Model contains custom File class made as a wrapper for java.io.File.
We've used it only to handle information displaying more easily.

Implementation for LocalStorage can be found on this link [LocalStorage implementation](https://github.com/andrejadikic/FileLocalImpl)

Implementation for GoogleDriveStorage can be found on this link [GoogleStorage implementation](https://github.com/Kovelja009/GoogleDriveImpl)
